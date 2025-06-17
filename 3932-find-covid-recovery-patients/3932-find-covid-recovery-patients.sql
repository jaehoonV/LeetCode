/* Write your PL/SQL query statement below */
SELECT C.patient_id, P.patient_name, P.age, MIN(C1.test_date) - MIN(C.test_date) recovery_time
FROM covid_tests C 
JOIN covid_tests C1 ON (
    C.patient_id = C1.patient_id 
    AND C.test_date < C1.test_date 
    AND C.result = 'Positive' 
    AND C1.result = 'Negative'
)
JOIN patients P ON (
    C.patient_id = P.patient_id
)
GROUP BY C.patient_id, P.patient_name, P.age
ORDER BY recovery_time, P.patient_name;