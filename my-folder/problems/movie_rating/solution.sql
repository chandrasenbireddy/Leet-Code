# Write your MySQL query statement below
(
    SELECT name AS results
    FROM Users U
    JOIN (
        SELECT user_id, COUNT(*) AS cnt
        FROM MovieRating
        GROUP BY user_id
    ) MR ON U.user_id = MR.user_id
    ORDER BY MR.cnt DESC, U.name
    LIMIT 1
)
UNION ALL
(
    SELECT title
    FROM Movies M
    JOIN (
        SELECT movie_id, AVG(rating) AS avg_rating
        FROM MovieRating
        WHERE created_at BETWEEN '2020-02-01' AND '2020-02-29'
        GROUP BY movie_id
    ) MR ON M.movie_id = MR.movie_id
    ORDER BY MR.avg_rating DESC, M.title
    LIMIT 1
);
