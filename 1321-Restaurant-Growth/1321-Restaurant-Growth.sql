/* Write your PL/SQL query statement below */
SELECT TO_CHAR(A.visited_on, 'YYYY-MM-DD') AS visited_on,
    SUM(B.amount) AS amount, 
    ROUND(AVG(B.amount), 2) AS average_amount
FROM (SELECT DISTINCT visited_on FROM Customer) A,
    (SELECT visited_on, SUM(amount) AS amount
    FROM Customer GROUP BY visited_on) B
WHERE B.visited_on BETWEEN A.visited_on - 6 AND A.visited_on
GROUP BY A.visited_on HAVING COUNT(B.visited_on) = 7
ORDER BY A.visited_on;