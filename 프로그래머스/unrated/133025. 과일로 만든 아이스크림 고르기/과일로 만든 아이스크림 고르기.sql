-- 코드를 입력하세요
# SELECT * FROM FIRST_HALF
# SELECT * FROM ICECREAM_INFO

SELECT B.FLAVOR AS FLAOVR FROM FIRST_HALF AS A, ICECREAM_INFO AS B 
WHERE A.FLAVOR = B.FLAVOR AND A.TOTAL_ORDER > 3000 AND B.INGREDIENT_TYPE = "fruit_based"
ORDER BY A.TOTAL_ORDER DESC