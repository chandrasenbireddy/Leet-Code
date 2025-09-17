# Write your MySQL query statement below
SELECT categories.category, COUNT(a.account_id) AS accounts_count
FROM (
    SELECT 'Low Salary' AS category
    UNION ALL
    SELECT 'Average Salary'
    UNION ALL
    SELECT 'High Salary'
) AS categories
LEFT JOIN (
    SELECT account_id,
           CASE 
               WHEN income < 20000 THEN 'Low Salary'
               WHEN income <= 50000 THEN 'Average Salary'
               ELSE 'High Salary'
           END AS category
    FROM Accounts
) AS a
ON categories.category = a.category
GROUP BY category;