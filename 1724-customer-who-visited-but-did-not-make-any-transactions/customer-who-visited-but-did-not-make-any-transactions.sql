# Write your MySQL query statement below

select v.customer_id, count(v.visit_id) as count_no_trans
from visits v
left join transactions tran
on v.visit_id = tran.visit_id
where tran.transaction_id is null
group by v.customer_id;