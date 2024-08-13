/* Write your PL/SQL query statement below */
SELECT
    TO_CHAR(transaction_date, 'YYYY-MM-DD') AS transaction_date,
    SUM(ODD_AMOUNT) AS odd_sum, 
    SUM(EVEN_AMOUNT) AS even_sum
FROM
    (
        SELECT 
            A.transaction_date,
            CASE WHEN MOD(A.amount, 2) = 1 THEN A.amount ELSE 0 END AS ODD_AMOUNT,
            CASE WHEN MOD(A.amount, 2) = 0 THEN A.amount ELSE 0 END AS EVEN_AMOUNT
        FROM transactions A
    )
GROUP BY transaction_date
ORDER BY transaction_date;