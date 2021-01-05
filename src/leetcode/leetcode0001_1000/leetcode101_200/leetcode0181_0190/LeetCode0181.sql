/* Write your PL/SQL query statement below */
select a.Name as Employee  FRom Employee a
left join Employee b
on a.ManagerId =b.Id
and a.ManagerId  is not null
where a.Salary>b.Salary




