/* Write your PL/SQL query statement below */
SELECT u.user_id buyer_id, TO_CHAR(u.join_date, 'YYYY-MM-DD') join_date, COUNT(o.order_date) orders_in_2019
FROM Users u
LEFT JOIN Orders o
ON u.user_id = o.buyer_id AND o.order_date BETWEEN '2019-01-01' AND '2019-12-31'
GROUP BY u.user_id, u.join_date
ORDER BY u.user_id;