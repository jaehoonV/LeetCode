/* Write your PL/SQL query statement below */
SELECT
	DATA.request_at AS "Day", 
	ROUND(COUNT(CASE WHEN DATA.status != 'completed' THEN 1 END) / COUNT(DATA.request_at), 2) AS "Cancellation Rate"
FROM
	(SELECT 
		T.status, 
		T.request_at,
		(SELECT banned FROM Users WHERE role = 'client' AND users_id = T.client_id) AS client_BAN,
		(SELECT banned FROM Users WHERE role = 'driver' AND users_id = T.driver_id) AS driver_BAN
	FROM Trips T) DATA
WHERE 
	DATA.client_BAN = 'No' 
	AND DATA.driver_BAN = 'No'
	AND DATA.request_at IN ('2013-10-01', '2013-10-02', '2013-10-03')
GROUP BY DATA.request_at