create database exercise3;
use exercise3;

create table customer(
id integer,
customer_name varchar(255),
city_id integer,
customer_address varchar(255),
contact_person varchar(255) ,
email varchar(128),
phone varchar(128),
primary key (id));

create table product(
id integer,
sku varchar(32),
product_name varchar(128),
product_description text,
current_price decimal(8,2),
quantity_in_stock integer,
primary key (id)
);

create table invoice(
id integer,
invoice_number varchar(255),
customer_id integer,
user_account_id integer,
total_price decimal(8,2),
time_issued datetime,
time_due datetime,
time_paid datetime,
time_canceled datetime,
time_refunded datetime,
primary key (id),
foreign key(customer_id) references customer(id));

create table invoice_item(
id integer,
invoice_id integer,
product_id integer,
quantity integer,
price decimal(8,2),
line_total_price decimal(8,2),
primary key (id),
foreign key(invoice_id) references invoice(id),
foreign key(product_id) references product(id)
);

INSERT INTO CUSTOMER VALUES
(1, 'Drogerie Wien', 1, 'Deckergasse 15A', 'Emil Steinbach', 'abc@gmail.com', 123455678);
INSERT INTO CUSTOMER VALUES
(2, 'John', 4, 'Deckergasse 1A', '9upper', 'abck@gmail.com', 12345567);
INSERT INTO CUSTOMER VALUES
(3, 'Mary', 8, 'Deckergasse 18A', '9upper', 'abcd@gmail.com', 1234556789);

INSERT INTO PRODUCT VALUES
(1, '330120', '9UP PRODUCT', 'COMPLETELY 9UP', 60, 122);
INSERT INTO PRODUCT VALUES
(2, '330121', '9UPPER PRODUCT', 'COMPLETELY 9UPPER', 50, 50);
INSERT INTO PRODUCT VALUES
(3, '330122', '9UPPER PRODUCTS', 'SUPER 9UPPER', 40, 600);
INSERT INTO PRODUCT VALUES
(4, '330123', '9UPPER PRODUCTSS', 'SUPER COMPLETELY 9UPPER', 30, 500);

INSERT INTO INVOICE VALUES
(1, 123456780, 2, 41, 1423, NULL, NULL, NULL, NULL, NULL);
INSERT INTO INVOICE VALUES
(2, 123456780, 3, 42, 1400, NULL, NULL, NULL, NULL, NULL);
INSERT INTO INVOICE VALUES
(3, 123456780, 2, 43, 17000, NULL, NULL, NULL, NULL, NULL);

INSERT INTO INVOICE_ITEM VALUES
(1, 1, 1, 40, 23, 920);
INSERT INTO INVOICE_ITEM VALUES
(2, 1, 2, 4, 20, 80);
INSERT INTO INVOICE_ITEM VALUES
(3, 1, 3, 4, 10, 40);
INSERT INTO INVOICE_ITEM VALUES
(4, 1, 2, 4, 30, 120);

select c.id,c.customer_name
from customer c left join invoice i
on c.id=i.customer_id
where i.customer_id is null
union all
select p.id as product_id , p.product_name
from product p left join invoice_item ii
on p.id=ii.product_id
where ii.product_id is null;

create table employee(
id integer not null auto_increment primary key,
employee_name varchar(30) not null,
salary decimal(8,2),
phone varchar(15),
email varchar(50),
dept_id integer not null
);
create table department(
id integer not null auto_increment primary key,
dept_code varchar(3),
dept_name varchar(200) not null
);

insert into employee values(1,'john',20000,90234567,'john@gmail.com',1);

insert into employee values(2,'mary',10000,90234561,'mary@gmail.com',1);
insert into employee values(3,'steve',30000,90234562,'steve@gmail.com',3);
insert into employee values(4,'john',40000,90234563,'sunny@gmail.com',4);

insert into department values(1,'hr','human resources');
insert into department values(2,'9up','9up d');
insert into department values(3,'sa','sales department');
insert into department values(4,'it','information t department');

select c.id, c.customer_name
from customer c left join invoice i
on c.id=i.customer_id
where i.customer_id is null
union all
select p.id, p.product_name
from product p left join invoice_item ii
on p.id= ii.product_id
where ii.product_id is null;

SELECT 'Customer' AS Type, c.id, c.customer_name as name
FROM customer c
LEFT JOIN invoice i ON c.id = i.customer_id
WHERE i.id IS NULL
UNION
SELECT 'Product' AS Type, p.id, p.product_name as name
FROM product p
LEFT JOIN invoice_item ii ON p.id = ii.product_id
WHERE ii.id IS NULL;








SELECT de.dept_code, COUNT(e.dept_id) AS num_employees
FROM department de
LEFT JOIN employee e ON e.dept_id = de.id
GROUP BY de.dept_code
ORDER BY num_employees DESC, de.dept_code ASC;





