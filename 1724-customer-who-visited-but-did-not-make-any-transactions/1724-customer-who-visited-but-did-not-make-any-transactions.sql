/* Write your PL/SQL query statement below */
SELECT 
    A.customer_id, 
    COUNT(A.customer_id) AS count_no_trans
FROM Visits A
WHERE A.visit_id NOT IN (SELECT visit_id FROM Transactions)
GROUP BY A.customer_id
