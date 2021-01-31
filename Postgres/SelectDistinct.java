// 1. syntax
SELECT
   DISTINCT column1
FROM
   table_name;


// 2. sample 1 => both columns affected
SELECT
   DISTINCT column1, column2
FROM
   table_name;


// 3. sample 2 => only first column affected
SELECT
   DISTINCT ON (column1) column_alias,
   column2
FROM
   table_name
ORDER BY
   column1,
   column2;


// 4. sample 3 => both column compare
SELECT
	DISTINCT bcolor,
	fcolor
FROM
	distinct_demo
ORDER BY
	bcolor,
	fcolor;


// 5. sample 4 => bcolor first, and then both
SELECT
	DISTINCT ON (bcolor) bcolor,
	fcolor
FROM
	distinct_demo 
ORDER BY
	bcolor,
	fcolor;