/* Write your PL/SQL query statement below */
SELECT B.product_id, B.product_name 
FROM Product B
WHERE B.product_id IN (SELECT A.product_id 
    FROM Sales A
    WHERE A.sale_date BETWEEN '2019-01-01' AND '2019-03-31')
    AND B.product_id NOT IN 
    (SELECT A.product_id 
    FROM Sales A
    WHERE A.sale_date < '2019-01-01' OR A.sale_date > '2019-03-31');
    
