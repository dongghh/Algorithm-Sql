-- 코드를 입력하세요
SELECT CAR_TYPE , COUNT(CAR_TYPE) AS CARS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS REGEXP '통풍시트|열선시트|가죽시트'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE

# REGEXP '통풍시트|열선시트|가죽시트' 정규식 표현
# =>'통풍시트 OR 열선시트 OR 가죽시트'과 같음
