/* Write your PL/SQL query statement below */
SELECT B.employee_id
FROM Employees B
WHERE B.manager_id IS NOT NULL
AND B.salary < 30000
AND NOT EXISTS(SELECT A.employee_id FROM Employees A WHERE A.employee_id = B.manager_id)
ORDER BY B.employee_id;