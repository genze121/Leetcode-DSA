# Write your MySQL query statement below

select en.unique_id,emp.name
from employees emp
left join employeeuni en
on emp.id = en.id