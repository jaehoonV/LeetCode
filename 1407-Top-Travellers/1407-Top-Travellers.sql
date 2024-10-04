/* Write your PL/SQL query statement below */
SELECT B.name, NVL(A.distance, 0) AS travelled_distance
FROM
    (
        SELECT user_id, SUM(distance) AS distance
        FROM Rides 
        GROUP BY user_id
    ) A, Users B
WHERE B.id = A.user_id(+)
ORDER BY NVL(A.distance, 0) DESC, B.name ASC;