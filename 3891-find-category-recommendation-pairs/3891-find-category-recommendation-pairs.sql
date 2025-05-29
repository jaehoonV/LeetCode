/* Write your PL/SQL query statement below */
WITH DATA AS(
    SELECT PP.user_id, PI.category
    FROM ProductPurchases PP
    JOIN ProductInfo PI ON PP.product_id = PI.product_id
)
SELECT 
    A.category AS category1,
    B.category AS category2,
    COUNT(DISTINCT A.user_id) AS customer_count
FROM DATA A JOIN DATA B ON A.category < B.category AND A.user_id = B.user_id
GROUP BY A.category, B.category
HAVING(COUNT(DISTINCT A.user_id)) > 2
ORDER BY customer_count DESC, category1, category2;