# Write your MySQL query statement below
select tweet_id
from tweets
group by tweet_id,content
having length(content) > 15;
