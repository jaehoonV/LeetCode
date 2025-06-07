SELECT 
    A.book_id, 
    A.title,
    A.author,
    A.genre,
    A.publication_year,
    B.CNT AS current_borrowers
FROM library_books A,
    (
        SELECT book_id, COUNT(book_id) AS CNT
        FROM borrowing_records
        WHERE return_date IS NULL
        GROUP BY book_id
    ) B
WHERE A.book_id = B.book_id AND A.total_copies = B.CNT
ORDER BY B.CNT DESC, A.title ASC