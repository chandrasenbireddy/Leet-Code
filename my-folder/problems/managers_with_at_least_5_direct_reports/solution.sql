# Write your MySQL query statement below
SELECT name
FROM Employee e
JOIN (
    SELECT managerId
    FROM Employee
    WHERE managerId IS NOT NULL
    GROUP BY managerId
    HAVING COUNT(*) > 4) m
    ON e.id = m.managerId;

