/* Write your PL/SQL query statement below */
SELECT ID
    ,CASE WHEN LEVEL = 1 THEN 'Root'
    WHEN CONNECT_BY_ISLEAF = 1 THEN 'Leaf'
    ELSE 'Inner' END AS TYPE
FROM TREE
START WITH P_ID is null
CONNECT BY PRIOR ID = P_ID;  