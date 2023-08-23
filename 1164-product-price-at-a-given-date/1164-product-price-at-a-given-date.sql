/* Write your PL/SQL query statement below */ 

SELECT A.product_id, NVL(B.price, 10) AS price 
FROM (SELECT DISTINCT A.product_id FROM Products A) A, 
    (SELECT A.product_id, A.new_price AS PRICE FROM Products A
        ,(SELECT product_id, MAX(change_date) AS change_date
            FROM Products
            WHERE change_date <= '2019-08-16'
            GROUP BY product_id) B
    WHERE A.change_date = B.change_date AND A.product_id = B.product_id) B
WHERE A.product_id = B.product_id(+);


