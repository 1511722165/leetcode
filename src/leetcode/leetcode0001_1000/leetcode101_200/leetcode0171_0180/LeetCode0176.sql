select
   nvl(max(salary),null) as secondhighestsalary 
from 
(select
    salary,
    dense_rank() over (order by salary desc) as rn
from employee ) tmp
where rn=2




select max(Salary) SecondHighestSalary  from  Employee 
where Salary <(
select max(Salary)  from  Employee )