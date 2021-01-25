/* Write your PL/SQL query statement below */
select * from (select id,revenue,month||'_revenue' as months
from Department
) pivot (max(revenue) for months in ('Jan_revenue' as Jan_revenue,
'Feb_revenue' as Feb_revenue,
'Mar_revenue' as Mar_revenue,
'Apr_revenue' as Apr_revenue,
'May_revenue' as May_revenue,
'Jun_revenue' as Jun_revenue,
'Jul_revenue' as Jul_revenue,
'Aug_revenue' as Aug_revenue,
'Sep_revenue' as Sep_revenue,
'Oct_revenue' as Oct_revenue,
'Nov_revenue' as Nov_revenue,
'Dec_revenue' as Dec_revenue));




/* Write your PL/SQL query statement below */
select * from (select id,revenue,month as months
from Department
) pivot (max(revenue) for months in ('Jan' as Jan_revenue,
'Feb' as Feb_revenue,
'Mar' as Mar_revenue,
'Apr' as Apr_revenue,
'May' as May_revenue,
'Jun' as Jun_revenue,
'Jul' as Jul_revenue,
'Aug' as Aug_revenue,
'Sep' as Sep_revenue,
'Oct' as Oct_revenue,
'Nov' as Nov_revenue,
'Dec' as Dec_revenue));



/* Write your PL/SQL query statement below */
select * from (select id,revenue,month 
from Department
) pivot (max(revenue) for month in ('Jan' as Jan_revenue,
'Feb' as Feb_revenue,
'Mar' as Mar_revenue,
'Apr' as Apr_revenue,
'May' as May_revenue,
'Jun' as Jun_revenue,
'Jul' as Jul_revenue,
'Aug' as Aug_revenue,
'Sep' as Sep_revenue,
'Oct' as Oct_revenue,
'Nov' as Nov_revenue,
'Dec' as Dec_revenue));