SELECT ID, EMAIL, FIRST_NAME, LAST_NAME 
FROM DEVELOPER_INFOS 
WHERE 'Python' IN (SKILL_1, SKILL_2, SKILL_3)
order by id asc;