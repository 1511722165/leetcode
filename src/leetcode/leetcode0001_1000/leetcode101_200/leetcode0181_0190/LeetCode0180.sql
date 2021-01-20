/* Write your PL/SQL query statement below */
select distinct a.Num as ConsecutiveNums from Logs a
inner join Logs b
on b.id=a.id+1
and a.Num=b.Num
inner join Logs c
on c.id=a.id+2
and a.Num=c.Num