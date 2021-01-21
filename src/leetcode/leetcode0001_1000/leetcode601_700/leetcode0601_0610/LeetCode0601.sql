with t1 as (
select id,visit_date,people ,id-rownum as flag from Stadium 
where people>=100
order by visit_date),
t2 as (
select t1.flag,count(t1.flag) as counts from 
t1
group by t1.flag
)
select t1.id "id" ,to_char(t1.visit_date,'yyyy-MM-dd') "visit_date", t1.people "people" from t1,t2
where t1.flag =t2.flag and  t2.counts>=3
order by t1.visit_date