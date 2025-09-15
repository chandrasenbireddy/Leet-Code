# Write your MySQL query statement below
SELECT 
  ROUND(COUNT(DISTINCT CASE WHEN a.event_date = DATE_ADD(fl.first_day, INTERVAL 1 DAY)
                      THEN a.player_id END) / COUNT(DISTINCT fl.player_id), 2) AS fraction
FROM (
    SELECT player_id, MIN(event_date) AS first_day
    FROM Activity
    GROUP BY player_id
) AS fl
JOIN Activity a
  ON fl.player_id = a.player_id;

