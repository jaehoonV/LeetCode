/* Write your PL/SQL query statement below */
select name Customers  from customers
where id not in(select customerId from orders);