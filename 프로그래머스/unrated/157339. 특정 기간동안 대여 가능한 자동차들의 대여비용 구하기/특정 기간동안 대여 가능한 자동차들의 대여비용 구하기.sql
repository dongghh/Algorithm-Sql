-- 코드를 입력하세요
SELECT distinct c.CAR_ID, c.CAR_TYPE, round(c.DAILY_FEE*30*(100-p.DISCOUNT_RATE)/100) FEE
from CAR_RENTAL_COMPANY_CAR c join (select CAR_TYPE, DISCOUNT_RATE
                                    from CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                                    where DURATION_TYPE = '30일 이상') p
on c.CAR_TYPE = p.CAR_TYPE
where c.CAR_ID not in (select CAR_ID
                       from CAR_RENTAL_COMPANY_RENTAL_HISTORY
                       where END_DATE > '2022-11-00'
                       and START_DATE < '2022-12-00')
and c.CAR_TYPE in ('세단', 'SUV')
having FEE >= 500000
and FEE < 2000000
order by FEE desc, c.CAR_TYPE, c.CAR_ID desc