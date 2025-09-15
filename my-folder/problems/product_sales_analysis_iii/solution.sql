# Write your MySQL query statement below
SELECT S.product_id, s.year AS first_year, s.quantity, s.price
FROM Sales S
JOIN (
    SELECT product_id, MIN(year) AS first_year
    FROM Sales
    GROUP BY product_id
) AS launch
ON S.product_id = launch.product_id
AND S.year = launch.first_year;