/* Write your PL/SQL query statement below */
SELECT a.product_id, a.year first_year, a.quantity, a.price 
FROM Sales a, (SELECT product_id, MIN(year) year FROM Sales GROUP BY product_id) b
WHERE a.product_id = b.product_id AND a.year = b.year;