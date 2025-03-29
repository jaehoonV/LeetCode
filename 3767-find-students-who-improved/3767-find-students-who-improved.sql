/* Write your PL/SQL query statement below */
SELECT 
    student_id,
    subject,
    first_score,
    latest_score
FROM
    (
        SELECT
        A.*,
        (
            SELECT B.score 
            FROM Scores B
            WHERE 
                B.student_id = A.student_id
                AND B.subject = A.subject
                AND B.exam_date = A.MIN_DATE
        ) AS first_score,
        (
            SELECT B.score 
            FROM Scores B
            WHERE 
            B.student_id = A.student_id
            AND B.subject = A.subject
            AND B.exam_date = A.MAX_DATE
        ) AS latest_score
        FROM
            (
            SELECT 
                student_id, 
                subject, 
                MIN(exam_date) AS MIN_DATE, 
                MAX(exam_date) AS MAX_DATE
            FROM Scores
            GROUP BY student_id, subject
        ) A
        WHERE A.MIN_DATE != A.MAX_DATE
    )
WHERE first_score < latest_score
ORDER BY student_id, subject;