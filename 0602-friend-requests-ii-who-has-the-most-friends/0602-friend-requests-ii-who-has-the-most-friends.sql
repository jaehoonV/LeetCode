/* Write your PL/SQL query statement below */
WITH A AS(SELECT ID, COUNT(ID) NUM
FROM (SELECT requester_id AS ID
    FROM RequestAccepted
    UNION ALL
    SELECT accepter_id AS ID
    FROM RequestAccepted) 
GROUP BY ID)
SELECT A.ID, A.NUM FROM A WHERE A.NUM = (SELECT MAX(NUM) FROM A);