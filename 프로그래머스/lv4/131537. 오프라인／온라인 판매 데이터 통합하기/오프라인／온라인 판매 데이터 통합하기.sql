-- 코드를 입력하세요
SELECT date_format(sales_date, '%Y-%m-%d') sales_date, product_id, user_id, sales_amount
FROM online_sale
WHERE date_format(sales_date, '%Y-%m') = '2022-03'
UNION ALL
SELECT date_format(sales_date, '%Y-%m-%d')sales_date, product_id, NULL AS user_id, sales_amount
FROM offline_sale 
WHERE date_format(sales_date, '%Y-%m') = '2022-03'

ORDER BY sales_date, product_id, user_id