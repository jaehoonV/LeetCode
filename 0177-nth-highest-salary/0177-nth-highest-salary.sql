CREATE FUNCTION getNthHighestSalary(N IN NUMBER) RETURN NUMBER IS
result NUMBER;
BEGIN
    /* Write your PL/SQL query statement below */
    SELECT DISTINCT B.SALARY INTO result
    FROM 
        (SELECT SALARY, DENSE_RANK() OVER (ORDER BY SALARY DESC) R FROM Employee) B
    WHERE B.R = N;
    RETURN result;
    EXCEPTION
    WHEN NO_DATA_FOUND THEN
    RETURN NULL;
END;