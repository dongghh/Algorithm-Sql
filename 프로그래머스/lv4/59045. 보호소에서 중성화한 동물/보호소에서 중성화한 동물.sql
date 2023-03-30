-- 코드를 입력하세요
SELECT ANIMAL_ID, ANIMAL_TYPE, NAME 
FROM ANIMAL_OUTS
WHERE ANIMAL_ID IN (
                    SELECT ANIMAL_ID FROM ANIMAL_INS
                    WHERE SEX_UPON_INTAKE LIKE "%Intact%")
                    && 
                    (
                    SEX_UPON_OUTCOME LIKE "%Spayed%" || SEX_UPON_OUTCOME LIKE "%Neutered%"
                    )
