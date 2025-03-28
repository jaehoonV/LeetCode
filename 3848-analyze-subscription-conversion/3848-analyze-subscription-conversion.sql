/* Write your PL/SQL query statement below */
SELECT user_id,
    ROUND(
        SUM(
            CASE 
                WHEN activity_type = 'free_trial' THEN activity_duration 
                ELSE 0 END
            ) / 
        SUM(
            CASE 
                WHEN activity_type = 'free_trial' THEN 1 
                ELSE 0 END
        )
    , 2) AS trial_avg_duration,
    ROUND(
        SUM(
            CASE 
                WHEN activity_type = 'paid' THEN activity_duration 
                ELSE 0 END
            ) / 
        SUM(
            CASE 
                WHEN activity_type = 'paid' THEN 1 
                ELSE 0 END
            )
    , 2) AS paid_avg_duration
FROM UserActivity
WHERE user_id IN (
    SELECT DISTINCT user_id 
    FROM UserActivity 
    WHERE activity_type = 'paid'
    )
GROUP BY user_id
ORDER BY user_id ASC;