-- Last updated: 08/05/2026, 22:22:46
SELECT user_id,
CONCAT(
UPPER(SUBSTRING(name,1,1)),
LOWER(SUBSTRING(name,2))
)AS name
FROM Users
ORDER BY user_id;

