/* Write your PL/SQL query statement below */
SELECT X, Y, Z, (CASE WHEN X + Y <= Z THEN 'No'
                WHEN X + Z <= Y THEN 'No'
                WHEN Y + Z <= X THEN 'No'
                ELSE 'Yes' END) AS TRIANGLE
FROM TRIANGLE;