/* Write your PL/SQL query statement below */
SELECT D.NAME Department, EE.NAME Employee, EE.Salary 
FROM Department D, 
    (SELECT E.departmentId, E.NAME, E.Salary FROM Employee E,
        (SELECT departmentId, MAX(salary) salary FROM Employee GROUP BY departmentId) max
     WHERE E.departmentId = max.departmentId AND E.salary = max.salary
     )EE
WHERE D.id = EE.departmentId;