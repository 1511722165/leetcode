with  t as (select max(Salary) Salary,DepartmentId DepartmentId from Employee  group by DepartmentId )

select b.name Department ,a.name Employee,t.Salary Salary from t,Employee a,Department b

where a.Salary =t.Salary  and t.DepartmentId =b.Id and a.DepartmentId =t.DepartmentId