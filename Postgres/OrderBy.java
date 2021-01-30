// 1. syntax
SELECT
	select_list
FROM
	table_name
ORDER BY
	sort_expression1 [ASC | DESC],
        ...
	sort_expressionN [ASC | DESC];


// 2. sample 1
SELECT
	first_name,
	last_name
FROM
	customer
ORDER BY
	first_name ASC;


// 3. sample 2
SELECT
       first_name,
       last_name
FROM
       customer
ORDER BY
       last_name DESC;


// 4. sample 3
SELECT
	first_name,
	last_name
FROM
	customer
ORDER BY
	first_name ASC,
	last_name DESC;


// 5. sample 4
SELECT 
	first_name,
	LENGTH(first_name) len
FROM
	customer
ORDER BY 
	len DESC;


// 6. sample 5
SELECT num
FROM sort_demo
ORDER BY num NULLS LAST;


// 7. sample 6
SELECT num
FROM sort_demo
ORDER BY num NULLS FIRST;


// 8. sample 7
SELECT num
FROM sort_demo
ORDER BY num DESC NULLS LAST;


