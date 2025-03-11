/* Write your PL/SQL query statement below */
SELECT user_id, email
FROM Users 
WHERE regexp_like(email, '^[[:alnum:]_]+@[[:alnum:]]+\.com$')
ORDER BY user_id;