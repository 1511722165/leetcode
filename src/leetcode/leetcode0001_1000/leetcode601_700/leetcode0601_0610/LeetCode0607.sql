select name from SalesPerson
where sales_id not in (
    select a.sales_id  from Orders a left join Company b on a.com_id =b.com_id
    where b.name ='RED'
)
