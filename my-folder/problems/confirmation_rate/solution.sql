# Write your MySQL query statement below
SELECT S.user_id,
ROUND ( CASE 
            WHEN C.confirmed = 0 OR T.total = 0 OR C.confirmed IS NULL OR T.total IS NULL THEN 0
            ELSE C.confirmed / T.total
            END, 2) AS confirmation_rate
FROM Signups S
LEFT JOIN 
(SELECT user_id, COUNT(*) AS confirmed
FROM Confirmations 
WHERE action = 'confirmed'
GROUP BY user_id) C 
ON S.user_id = C.user_id
LEFT JOIN
(SELECT user_id, COUNT(*) AS total
FROM Confirmations 
GROUP BY user_id) T
ON S.user_id = T.user_id;