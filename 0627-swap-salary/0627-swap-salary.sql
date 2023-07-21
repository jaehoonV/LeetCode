/* Write your PL/SQL query statement below */
UPDATE Salary SET sex = 
CASE WHEN sex = 'm' THEN 'f' ELSE 'm' END;