/* Write your PL/SQL query statement below */
select a.stock_name, sum(a.price) as capital_gain_loss
from (select stock_name, case when operation = 'Sell' then price else price * -1 end as price
        from Stocks) a
group by a.stock_name;
