// 1. syntax
SELECT
   select_list
FROM
   table_name;


// 2. sample 1
SELECT
   select_list
FROM
   table_name;


// 3. sample 2
SELECT
   first_name,
   last_name,
   email
FROM
   customer;


// 4. sample 3 => all
SELECT * FROM customer;


// 5. sample 4 => combine two column into one
SELECT 
   first_name || ' ' || last_name,
   email
FROM 
   customer;

