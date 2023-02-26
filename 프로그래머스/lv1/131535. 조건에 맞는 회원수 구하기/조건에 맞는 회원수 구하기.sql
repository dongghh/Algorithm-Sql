-- 코드를 입력하세요
SELECT COUNT(USER_ID) 
FROM user_info 
WHERE joined like '2021%'
and age between 20 and 29