# Write your MySQL query statement below

select w1.id
from weather w1
join weather w2
on w1.recordDate = DATE_ADD(w2.recordDate,Interval 1 DAY)
where w1.temperature > w2.temperature;