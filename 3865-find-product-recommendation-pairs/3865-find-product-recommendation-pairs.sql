/* Write your PL/SQL query statement below */
SELECT 
    pp1.product_id AS product1_id,
    pp2.product_id AS product2_id,
    pi1.category AS product1_category,
    pi2.category AS product2_category,
    COUNT(*) AS customer_count
FROM 
    ProductPurchases pp1,
    ProductPurchases pp2,
    ProductInfo pi1,
    ProductInfo pi2
WHERE 
    pp1.user_id = pp2.user_id
    AND pp1.product_id < pp2.product_id
    AND pp1.product_id = pi1.product_id
    AND pp2.product_id = pi2.product_id
GROUP BY 
    pp1.product_id,
    pp2.product_id,
    pi1.category,
    pi2.category
HAVING COUNT(*) >= 3
ORDER BY 5 DESC, 1, 2