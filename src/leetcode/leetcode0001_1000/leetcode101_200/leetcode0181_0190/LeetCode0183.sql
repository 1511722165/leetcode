/* Write your PL/SQL query statement below */
select Name Customers  from Customers  
where Id  not in (
select CustomerId  from Orders 
)