/* Write your PL/SQL query statement below */
SELECT DISTINCT a.num AS ConsecutiveNums FROM Logs a, Logs b, Logs c
WHERE a.id + 1 = b.id AND a.id + 2 = c.id
AND a.num = b.num AND a.num = c.num;