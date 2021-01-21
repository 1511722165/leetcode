select Day,ROUND(sum(decode(t.Status,'completed',0,t.he))/sum(t.he),2) as "Cancellation Rate"
from (select Status,count(1) as he,
Request_at as Day
from Trips  
where Client_Id in(
select Users_Id from Users 
where Banned ='No' and Role='client'
)
and Driver_Id in (
select Users_Id from Users 
where Banned ='No' and Role='driver'
) 
and Request_at >= '2013-10-01'
and Request_at <= '2013-10-03'
group by Status,Request_at) t group by t.Day order by t.Day