# Write your MySQL query statement below

SELECT w1.id
FROM Weather w1
JOIN Weather w2
ON w1.recordDate = w2.recordDate + INTERVAL 1 DAY
WHERE w1.temperature > w2.temperature;


-- select w.id
-- from Weather w
-- where w.temperature > (select temperature 
--                        from Weather 
--                        where recordDate = DATE_SUB(w.recordDate, INTERVAL 1 DAY));