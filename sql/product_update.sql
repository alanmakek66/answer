

use sys;

create table product(
product_id integer,
product_name varchar(255),
product_price decimal (10,2),
product_description  text,
product_create_at datetime DEFAULT CURRENT_TIMESTAMP
);
insert into product (product_id,product_name,product_price,product_description,product_create_at)
values(1,'Laptop',999.99,'High-performance laptop with SSD storage.',now());

insert into product (product_id,product_name,product_price,product_description,product_create_at)
values(2,'Smartphone',599.50,'4G smartphone with advanced camera features.',now());

insert into product (product_id,product_name,product_price,product_description,product_create_at)
values(3,'Headphones',79.99,'Wireless headphones with noise-canceling technology.',now());

SELECT * FROM product ORDER BY product_name ASC;
SELECT * FROM product WHERE product_price = (SELECT MAX(product_price) FROM product);
SELECT COUNT(*) AS product_count FROM product;
SELECT * FROM product where product_name like '%laptop%';
SELECT AVG(product_price) AS average_price FROM product;
SELECT * FROM product WHERE product_create_at = (SELECT MIN(product_create_at) FROM product);
SELECT sum(product_price) from product;
SELECT MIN(product_price) AS `Max Price for Phones`
FROM product
WHERE LOWER(product_name) LIKE '%phone%';

SELECT product_name, product_price, product_description AS `Product Description`
FROM product
WHERE LOWER(product_description) LIKE '%wireless%';

create table Sales(
Sales_id integer,
product_id integer,
product_name  varchar(255),
unit_price  decimal (10,2),
quantity_sold  integer,
discount_amount decimal (12,2),
tax_rate decimal (5,2),
shipping_cost decimal (10,2),
handling_fee  decimal (10,2)
);











