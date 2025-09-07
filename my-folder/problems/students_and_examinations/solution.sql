# Write your MySQL query statement below
SELECT S.student_id, S.student_name, Sb.subject_name, COUNT(E.subject_name) AS attended_exams
FROM Students AS S
CROSS JOIN Subjects AS Sb
LEFT JOIN Examinations AS E
ON S.student_id = E.student_id AND Sb.subject_name = E.subject_name
GROUP BY S.student_id, Sb.subject_name
ORDER BY S.student_id, Sb.subject_name;