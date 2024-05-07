use sys;

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

insert into Sales (Sales_id,product_id,product_name,unit_price,quantity_sold,discount_amount,tax_rate
,shipping_cost,handling_fee)
values (1,1,'Laptop',999.99,2,0.00,5,10.50,5.25);

insert into Sales (Sales_id,product_id,product_name,unit_price,quantity_sold,discount_amount,tax_rate
,shipping_cost,handling_fee)
values (2,2,'Smartphone',599.50,5,25.75,7.5,5.75,3.25);
insert into Sales (Sales_id,product_id,product_name,unit_price,quantity_sold,discount_amount,tax_rate
,shipping_cost,handling_fee)
values (3,3,'Headphones',79.99,10,5.00,5,2.99,1.50);

delete from sales where Sales_id=1;





