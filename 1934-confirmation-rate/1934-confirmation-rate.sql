/* Write your PL/SQL query statement below */
SELECT B.user_id AS user_id, ROUND(AVG(A.C_CNT), 2) AS confirmation_rate
FROM
    (SELECT user_id
        , CASE WHEN action = 'confirmed' THEN 1 ELSE 0 END AS C_CNT
    FROM Confirmations) A
    , Signups B
WHERE B.user_id = A.user_id(+)
GROUP BY B.user_id;