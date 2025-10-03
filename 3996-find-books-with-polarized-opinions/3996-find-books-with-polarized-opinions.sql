/* Write your PL/SQL query statement below */
WITH RS AS(
    SELECT 
        book_id,
        COUNT(*) AS cnt,
        MIN(session_rating) AS min_r,
        MAX(session_rating) AS max_r,
        SUM(CASE WHEN session_rating > 3 THEN 1 ELSE 0 END) AS high_r,
        SUM(CASE WHEN session_rating < 3 THEN 1 ELSE 0 END) AS low_r,
        SUM(CASE WHEN session_rating != 3 THEN 1 ELSE 0 END) AS r3
    FROM reading_sessions
    GROUP BY book_id
)
SELECT 
    book_id,
    title,
    author,
    genre,
    pages,
    (max_r - min_r) AS rating_spread,
    ROUND(r3 * 1.0 / cnt, 2) AS polarization_score 
FROM RS
JOIN books USING(book_id)
WHERE cnt > 4
    AND high_r > 0
    AND low_r > 0
    AND ROUND(r3 * 1.0 / cnt, 2) >= 0.6
ORDER BY polarization_score DESC, title DESC