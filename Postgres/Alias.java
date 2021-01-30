// 1. syntax
SELECT column_name AS alias_name
FROM table_name;


// 2. sample 1
SELECT
    first_name || ' ' || last_name AS full_name
FROM
    customer;


// 3. sample 2
SELECT
    first_name || ' ' || last_name "full name"
FROM
    customer;


// 4. sample 3
