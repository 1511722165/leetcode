/* Write your PL/SQL query statement below */
with  t as (
     select name as names ,dense_rank() over(partition by DepartmentId order by Salary desc) as rank from Employee  
         )

select b.name Department ,a.name Employee,a.Salary Salary from t,Employee a,Department b

where a.name =t.names  and  a.DepartmentId =b.id and t.rank<=3