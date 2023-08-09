/* Write your PL/SQL query statement below */
WITH Q AS (SELECT person_name, weight, SUM(weight) OVER(ORDER BY turn) AS t_weight
        FROM Queue)
SELECT person_name FROM Q WHERE t_weight = (SELECT MAX(t_weight) FROM Q WHERE t_weight <= 1000);