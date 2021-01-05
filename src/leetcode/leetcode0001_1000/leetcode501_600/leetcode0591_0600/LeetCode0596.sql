/* Write your PL/SQL query statement below */
select t1.class from (
select count(t.class) counts,t.class as class from 
(
select distinct  student ,class       from courses 
) t
group by class) t1
where t1.counts>=5



----------------------
SELECT
	class 
FROM
	courses 
GROUP BY
	class 
HAVING
	count( DISTINCT student ) >= 5;