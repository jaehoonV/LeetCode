/* Write your PL/SQL query statement below */
SELECT e.name AS name, b.bonus
FROM Employee e, Bonus b
WHERE e.empId = b.empId(+)
AND (b.bonus IS NULL OR b.bonus < 1000); 