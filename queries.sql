## Part 1: Test it with SQL
CREATE TABLE job (
   id INT,
   employer VARCHAR(255),
   name VARCHAR(50),
   skills VARCHAR(255)
);
## Part 2: Test it with SQL
SELECT employer
FROM job
WHERE location = "St. Louis";

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT skills, description
FROM job
ORDER BY skills ASC
WHERE skills IS NOT NULL;