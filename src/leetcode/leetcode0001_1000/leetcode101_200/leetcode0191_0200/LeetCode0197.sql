/* Write your PL/SQL query statement below */
select a.Id from Weather a
left join Weather b
on a.recordDate -1=b.recordDate 
where a.Temperature >b.Temperature 