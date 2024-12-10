# Write your MySQL query statement below
select pro.product_name,sale.year,sale.price
from sales sale
left join product pro
on sale.product_id = pro.product_id;