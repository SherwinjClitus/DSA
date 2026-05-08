-- Last updated: 08/05/2026, 22:22:33
# JOINING & SUBQUERY CONCEPT
SELECT
     E.employee_id,
     E.department_id
FROM Employee E
LEFT JOIN 
(SELECT E.*,
COUNT(E.department_id) AS dept_cnt
FROM Employee E
GROUP BY employee_id) AS t
ON E.employee_id = t.employee_id
WHERE (t.dept_cnt = 1 OR E.primary_flag='Y');