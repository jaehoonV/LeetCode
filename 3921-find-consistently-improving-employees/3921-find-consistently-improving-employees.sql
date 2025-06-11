/* Write your PL/SQL query statement below */
WITH t AS(
SELECT
	employee_id,
    review_date,
    rating, 
    RANK() OVER (PARTITION BY employee_id ORDER BY review_date DESC) AS R
FROM 
	performance_reviews
)
SELECT 
	t1.employee_id,
    e.name,
    t1.rating - t3.rating AS improvement_score    
FROM 
	t t1
	JOIN t t2 
    ON t1.employee_id = t2.employee_id AND t1.review_date > t2.review_date
	JOIN t t3 
    ON t2.employee_id = t3.employee_id AND t2.review_date > t3.review_date
    JOIN employees e
    ON t1.employee_id = e.employee_id
WHERE 
	t1.R <= 3
	AND t1.rating > t2.rating 
	AND t2.rating > t3.rating
	AND	t1.R = 1 
	AND t3.R = 3
ORDER BY (t1.rating - t3.rating) DESC, e.name ASC