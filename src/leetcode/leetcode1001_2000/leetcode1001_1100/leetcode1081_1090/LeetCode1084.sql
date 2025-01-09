#
Write your MySQL query statement below

select t.product_id, a.product_name
from (
         select b.product_id                                                   as product_id,
                count(1)                                                       as sumc,
                sum(IF(sale_date BETWEEN '2019-01-01' AND '2019-03-31', 1, 0)) as count1
         from Sales b
         group by product_id) t
         left join Product a on t.product_id = a.product_id
where t.sumc = t.count1
  and t.count1 > 0