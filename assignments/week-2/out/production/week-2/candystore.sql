
create table inventory(
    id int primary key,
    "name" varchar(255),
    price decimal(10,2),
    description varchar(255),
    quantity int
);

INSERT INTO inventory
VALUES
(1001,	'Hershey Bar',	3.45,	'A small chocolate bar',	50),
(1002,	'Skittles',	3.05,	'A bag of rainbow colored candies',	100),
(2003,	'Gummy Bears',	5.55,	'A large bag of chewy fruit-flavored bears',	48),
(2005,	'Sour Gummy Worms',	9.55,	'A very large bag of gelatin worms',	20),
(3008,	'Lollipop',	2.25,	'A hard candy atop a stick',	268),
(9007,	'M&Ms',	1.95,	'A bag of small chocolate candies',	58);

SELECT *
FROM inventory;

UPDATE inventory
SET quantity = 48
WHERE "name" = 'Hershey Bar';

SELECT description
FROM inventory;

SELECT "name", price
FROM inventory;

UPDATE inventory
SET description = 'A very large, delicious bag of worms'
WHERE "name" = 'Sour Gummy Worms';

UPDATE inventory
SET quantity = 100
WHERE "name" = 'M&Ms';

UPDATE inventory
SET price = 2.50
WHERE "name" = 'Lollipop';

CREATE TABLE employees(
id int,
"name" varchar(255),
favorite_candy int REFERENCES inventory
);

INSERT INTO employees
VALUES
(4001,	'Willy Wonka',	2005),
(4002,	'Milton Hershey',	1001),
(4003,	'Franklin Mars',	9007),
(4004,	'John Cadbury',	NULL);

SELECT e.name, e.favorite_candy
FROM employees e
JOIN inventory i ON e.favorite_candy = i.id;

SELECT i.name, e.name
FROM inventory i
LEFT JOIN employees e ON i.id = e.favorite_candy;

--BONUS

SELECT price * quantity
FROM inventory
WHERE inventory.name = 'M&Ms';

SELECT "name", price
FROM inventory
WHERE quantity = (SELECT min(quantity) FROM inventory);

SELECT "name", quantity
FROM inventory
WHERE quantity = (SELECT max(quantity) FROM inventory);

SELECT *
FROM inventory
ORDER BY price DESC
LIMIT 3;

SELECT avg(price)
FROM inventory;

SELECT e.name
FROM employees e
JOIN inventory i ON i.id = e.favorite_candy
WHERE description LIKE '%chocolate%';
