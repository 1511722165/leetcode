/* Write your PL/SQL query statement below */

with t1 as (
select max(id) as id from 
seat
)
,t2 as (
select   (id-1) as id,student  from seat 
where mod(id,2)=0
)
,t3 as (
select   (id+1) as id,student  from seat 
where mod(id,2)=1
and id!=(
    select t1.id
    from t1
)
)
select  t.id,t.student from (
select  id as id,student as student from t2
union all 
select  id as id,student as student from t3
union all
select seat.id as id,seat.student as student from seat,t1
where t1.id=seat.id
and mod(t1.id,2)=1
)t order by t.id 






SELECT (CASE 
            WHEN MOD(id,2) = 1 AND id = (SELECT COUNT(*) FROM seat) THEN id
            WHEN MOD(id,2) = 1 THEN id+1
            ElSE id-1
        END) AS id, student
FROM seat
ORDER BY id