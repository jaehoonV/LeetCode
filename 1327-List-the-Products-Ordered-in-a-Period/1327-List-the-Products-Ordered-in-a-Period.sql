/* Write your PL/SQL query statement below */
SELECT 
	A.product_name, 
	B.unit
FROM Products A,
	(
		SELECT product_id, SUM(unit) unit
		FROM Orders 
		WHERE order_date BETWEEN '2020-02-01' AND '2020-02-29'
		GROUP BY product_id HAVING SUM(unit) >= 100
	) B
WHERE A.product_id = B.product_id