select max(num) as num
from (
         select num, count(1) as c
         from MyNumbers
         group by num) t
where t.c = 1