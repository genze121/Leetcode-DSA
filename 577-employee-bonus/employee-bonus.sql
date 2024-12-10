# Write your MySQL query statement below

select emp.name, bon.bonus
from employee emp
left join
bonus bon
on emp.empid = bon.empid
where bon.bonus < 1000 or bon.bonus is null;