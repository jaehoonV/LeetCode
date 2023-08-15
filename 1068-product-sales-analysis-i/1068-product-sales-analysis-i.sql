/* Write your PL/SQL query statement below */
SELECT P.product_name, S.year, S.price
FROM Product P, Sales S
WHERE P.product_id = S.product_id;