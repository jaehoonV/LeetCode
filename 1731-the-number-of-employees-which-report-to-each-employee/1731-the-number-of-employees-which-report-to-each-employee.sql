/* Write your PL/SQL query statement below */
SELECT A.employee_id, E.name, A.reports_count, A.average_age
FROM
    (
        SELECT 
            reports_to AS employee_id, 
            COUNT(reports_to) AS reports_count, 
            ROUND(AVG(age)) AS average_age 
        FROM Employees 
        GROUP BY reports_to HAVING reports_to IS NOT NULL
    ) A, Employees E
WHERE A.employee_id = E.employee_id
ORDER BY A.employee_id