/* Write your PL/SQL query statement below */
WITH SS AS (
    SELECT 
        P.category, 
        CASE 
            WHEN EXTRACT (MONTH FROM S.sale_date) IN (12,1,2) THEN 'Winter' 
            WHEN EXTRACT (MONTH FROM S.sale_date) IN (3,4,5) THEN 'Spring'
            WHEN EXTRACT (MONTH FROM S.sale_date) IN (6,7,8) THEN 'Summer'
            ELSE 'Fall'
        END AS season,
        S.quantity, 
        S.price
    FROM sales S
    LEFT JOIN products P ON (S.product_id = P.product_id)
),
TS AS (
    SELECT
        SS.season,
        SS.category,
        SUM(SS.quantity) AS total_quantity,
        SUM(SS.quantity * SS.price) AS total_revenue
    FROM SS
    GROUP BY SS.category, SS.season
)
SELECT 
    A.season,
    A.category,
    A.total_quantity,
    A.total_revenue
FROM (
    SELECT
        TS.*,
        DENSE_RANK() OVER(PARTITION BY TS.season ORDER BY TS.total_quantity DESC, TS.total_revenue DESC) AS RANK
    FROM TS
    ) A
WHERE A.RANK = 1;