/* Write your PL/SQL query statement below */
SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary 
FROM Department d, Employee e
WHERE e.DepartmentId = d.id
    AND 3 > (
        SELECT COUNT(DISTINCT a.salary)
        FROM Employee a 
        WHERE a.salary > e.salary AND e.departmentId = a.departmentId)