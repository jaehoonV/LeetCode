/* Write your PL/SQL query statement below */
WITH TEMP AS (SELECT customer_id, MIN(order_date) FIRST_order_date
    FROM Delivery 
    GROUP BY customer_id)
SELECT 
    ROUND(SUM(CASE WHEN A.order_date = A.customer_pref_delivery_date THEN 1 ELSE 0 END) / COUNT(B.customer_id) * 100, 2) AS immediate_percentage
FROM Delivery A, TEMP B
WHERE A.customer_id = B.customer_id
    AND A.order_date = B.FIRST_order_date;