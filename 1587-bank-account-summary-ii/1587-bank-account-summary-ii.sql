/* Write your PL/SQL query statement below */

SELECT A.name, B.amount AS balance
FROM Users A,
    (
        SELECT account, SUM(amount) AS amount
        FROM Transactions
        GROUP BY account
    )B
WHERE A.account = B.account AND B.amount > 10000;