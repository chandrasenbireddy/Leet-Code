# Write your MySQL query statement below
SELECT DISTINCT num AS ConsecutiveNums 
FROM (SELECT num, LAG(num, 1) OVER (ORDER BY id) AS prev1, 
LAG(num, 2) OVER (ORDER BY id) AS prev2 FROM LOGS) AS sub
WHERE num = prev1 and num = prev2;