# Write your MySQL query statement below
select w.id
from Weather w
where w.temperature > (select temperature from Weather where recordDate = DATE_SUB(w.recordDate, INTERVAL 1 DAY))