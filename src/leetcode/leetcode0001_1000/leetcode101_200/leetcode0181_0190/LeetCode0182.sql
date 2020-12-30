/* Write your PL/SQL query statement below */
select Email from (
select Email,count(Email) counts from Person
group by Email)
where counts>1