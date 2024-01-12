/* Write your PL/SQL query statement below */
SELECT 
  CASE 
    WHEN MOD(ID, 2) = 1  AND ID = (SELECT MAX(ID) FROM SEAT) THEN ID 
    WHEN MOD(ID, 2) = 1 THEN ID + 1
    ELSE ID - 1 END AS ID,
    STUDENT
FROM SEAT
ORDER BY ID;