use sys;
create table fruit(
 fruit_desc varchar(10),
 fruit_price decimal(4,1),
 fruit_quantity integer

);
insert into fruit(fruit_desc,fruit_price,fruit_quantity) values('apple',10.2,200);
insert into fruit(fruit_desc,fruit_price,fruit_quantity) values('banana',20000.2,200);
insert into fruit(fruit_desc,fruit_price,fruit_quantity) values('orange',20.2,200);
insert into fruit(fruit_desc,fruit_price,fruit_quantity) values('mango',8,200);
insert into fruit(fruit_desc,fruit_price,fruit_quantity) values('apple',2.2,150);

update fruit set fruit_price =8;
update fruit set fruit_price= 4.5 where fruit_desc='apple';
select fruit_desc from fruit;
select distinct fruit_desc from fruit;
select fruit_desc,length(fruit_desc) as desc_length from fruit;
select upper(fruit_desc) as upper_desc from fruit;

SELECT fruit_desc, LENGTH(fruit_desc) AS desc_length, UPPER(fruit_desc) AS upper_desc
FROM fruit;
select fruit_desc from fruit where fruit_desc like 'b%';
alter table fruit add origin varchar(10);
update fruit set origin ='china' where fruit_desc ='apple';
update fruit set origin ='usa' where fruit_desc ='orange';
update fruit set origin ='japan' where fruit_desc ='banana';
update fruit set origin ='hong_kong' where fruit_desc ='mango';

use sys;
create table human(
human_age integer,
human_weigth_kg decimal(4,1),
human_name varchar(30)
);
alter table human add date_birth date;
insert into human(human_age,human_weigth_kg,human_name,date_birth) values (18,130,'alan','1997-06-20');
use sakila;
use sys;
alter table human add primary key(human_name);

create table product(
product_id integer,
product_name varchar(255),
product_price decimal (12,2),
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
unit_price  decimal (12,2),
quantity_sold  integer,
discount_amount decimal (12,2),
tax_rate decimal (5,2),
shipping_cost decimal (12,2),
handling_fee  decimal (12,2)
);











