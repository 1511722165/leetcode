CREATE FUNCTION getNthHighestSalary(N IN NUMBER) RETURN NUMBER IS
result NUMBER;
BEGIN
    /* Write your PL/SQL query statement below */
    select max(t.Salary) into  result from(
    select Salary ,dense_rank() over(order by Salary desc) as rowsId from Employee 
    )t where t.rowsId=N
;
    RETURN result;
END;