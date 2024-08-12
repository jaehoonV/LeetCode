/* Write your PL/SQL query statement below */
SELECT A.employee_id, A.department_id
FROM Employee A
LEFT OUTER JOIN 
    (
        SELECT employee_id, 
            CASE 
                WHEN COUNT(employee_id) = 1 THEN 'Y'
                ELSE 'N'
            END AS CNT_YN
        FROM Employee
        GROUP BY employee_id
    ) B
	 ON A.employee_id = B.employee_id
WHERE (B.CNT_YN = 'Y') 
	OR (B.CNT_YN = 'N' AND A.primary_flag = 'Y')