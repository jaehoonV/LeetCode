/* Write your PL/SQL query statement below */
SELECT NAME
FROM Customer 
WHERE referee_id IS NULL OR referee_id != 2;