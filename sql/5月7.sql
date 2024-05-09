use sys;

create table customer2(
id integer,
first_name varchar(20),
last_name varchar(20),
phone varchar(50),
email varchar(50)
);
insert into customer2 values(1,'vincent','lau','852 12345678','vincent@gmail.com'),
(2,'oscar','lo','852 87654321','oscar@gmail.com');

select concat(first_name,' ',last_name) as full_name from customer2;
select substring(last_name,1,2) as first_charcter from customer2;
select length(first_name),length(last_name) from customer2;
select upper(first_name),lower(first_name),concat(first_name,' ',upper(last_name)) from customer2;
insert into customer2 values (3,'jenny','lau','852 43121234','vincent@gmail.com');
select c.*, length(trim(c.phone)), length(c.phone) from customer2 c;
select replace(concat(first_name,' ',last_name),'lau','chan') new_name from customer2;
select left(first_name,2), right(first_name,2) from customer2;
insert into customer2 values(4,'thomas','陳','852 11111111','123@gmail.com');

SELECT c.*, LENGTH(c.last_name)
FROM customer2 c;
select c.*, instr(c.first_name,'i') from customer2 c;
select * from customer2 where first_name like'vin%';
select round(4.353,1), round (4.353,2) from dual;
select abs(-5) from dual;
select power(2,3), power(-2,4) from dual; -- 次方
-- date add
select date_add('2023-07-15',interval 3 month) from dual;
select date_add('2023-07-15',interval 3 day) from dual;

select datediff('2023-12-31','2023-01-01') from dual;
select now() from dual;
select extract(year from '2023-12-31') from dual;
select extract(month from '2023-12-31') from dual;
select extract(day from '2023-12-31') from dual;
select ifnull(null,0) from dual;
-- select ifnull(radius,0)*ifnull(radius,0)*pi from circle; -- coalesce

select 
c.*,
case
when c.color='red' then 'r'
when c.color='yellow' then 'y'
else 'b'
 end as color_short_name
 from circle c;

select* from customer2;
alter table customer2 add membership varchar(1);
update customer2 set membership = 'g' where upper(last_name)='lau';
update customer2 set membership = 's' where upper(ifnull(last_name,'x'))<>'lau';

select membership , count(*) from customer2 group by membership; -- first execute from 
alter table customer2 add age int;
update customer2 set age=13 where first_name ='vincent';
update customer2 set age=18 where first_name ='jenny';
update customer2 set age=30 where first_name not in('vincent','jenny');

select membership ,count(membership), avg(age), min(age),sum(age) from customer2 group by membership;

select last_name, avg(age)
from customer2
group by last_name;

select last_name,count(1) as count
from customer2
where upper(ifnull(last_name,'x'))<>'lau' -- excute before gp by
group by last_name;

-- having

select last_name,count(1) as aaaa
from customer2
where upper(ifnull(last_name,'x'))<>'lo' -- excute before gp by
group by last_name 
having count(1)>1;

insert into customer2 values(7,	'vincent',	'lau'	,'852 12345678'	,'vincent@gmail.com'	,'g'	,13);

select count(null) from customer2 ;
select count(age) from customer2 ;

create table order2(
order_id int,
customer_id int,
delivery_address varchar(100),
total_amount decimal(10,2)
);
insert into order2 values (1, 2, 'ABC XYZ', 100.44);
insert into order2 values (2, 2, 'xxxABC XYZ', 22.88);
insert into order2 values (3, 1, 'aaABC XYZ', 12.12);
insert into order2 values (4, 3, 'aaAfffffBC XYZ', 90.12);
select * from order2;
-- inner join mutliply 2 set of records
select * from customer2 inner join order2;
-- approach 1
-- inner join find all orders with its customer data
select * from customer2 c inner join order2 o on c.id=o.customer_id;

select c.first_name,c.last_name,c.phone,c.email,o.total_amount,o.delivery_address

 from customer2 c inner join order2 o on c.id=o.customer_id
 where o.total_amount>30;
 -- approach 2
 
 select c.first_name,c.last_name,c.phone,c.email,o.total_amount,o.delivery_address

 from customer2 c inner join order2 o 
 
 where c.id=o.customer_id and o.total_amount>0;
 -- primary key -> unique, not null ,idex
 create table computer_scienists(
 scientists_id int,
 first_name varchar(20),
 last_name varchar(20),
 date_of_birth date,
 nationality varchar(3)
 );
 create table winners(
 winner_id int,
 scientists_id int,
 award_year varchar(4)
 );
 create table countries(
 countries_id varchar(2),
 country_name varchar(20)
 );
 create table awards(
 award_id varchar(4),
 main_contribution varchar(200)
 );
 
 insert into computer_scienists (scientists_id,first_name,last_name,date_of_birth,nationality)
 values(21,'shafria','goldwasser',null,'us');
 insert into computer_scienists (scientists_id,first_name,last_name,date_of_birth,nationality)
 values(22,'alan','turing','1912-05-23','uk');
 insert into computer_scienists (scientists_id,first_name,last_name,date_of_birth,nationality)
 values(23,'judea','pearl','1936-09-04','il');
 insert into computer_scienists (scientists_id,first_name,last_name,date_of_birth,nationality)
 values(24,'leslie','lamport','1941-02-08','us');
 insert into computer_scienists (scientists_id,first_name,last_name,date_of_birth,nationality)
 values(25,'micheal','stonebraker','1943-10-11','us');
 insert into computer_scienists (scientists_id,first_name,last_name,date_of_birth,nationality)
 values(26,'whitfield','diffie','1944-05-05','us');
 insert into computer_scienists (scientists_id,first_name,last_name,date_of_birth,nationality)
 values(27,'martin','hellman','1945-10-02','us');
 insert into computer_scienists (scientists_id,first_name,last_name,date_of_birth,nationality)
 values(28,'silvio','micali','1954-10-13','it');
 
 insert into winners (winner_id,scientists_id,award_year)
 values (58,23,'2011');
 insert into winners (winner_id,scientists_id,award_year)
 values (59,21,'2012');
 insert into winners (winner_id,scientists_id,award_year)
 values (60,28,'2012');
 insert into winners (winner_id,scientists_id,award_year)
 values (61,24,'2013');
 insert into winners (winner_id,scientists_id,award_year)
 values (62,25,'2014');
 insert into winners (winner_id,scientists_id,award_year)
 values (63,26,'2015');
 insert into winners (winner_id,scientists_id,award_year)
 values (64,27,'2015');
ALTER TABLE countries
ADD PRIMARY KEY (countries_id);

insert into countries values('IL','ISRAEL');
insert into countries values('IT','ITALY');
insert into countries values('UK','UNITED KINGDOM');
insert into countries values('US','UNITED STATES');

insert into awards values ('2011', 'xxxx yyyy');
insert into awards values ('2012', 'abc abc');
insert into awards values ('2013', 'ijkijk');
insert into awards values ('2014', 'pulu pulu');
insert into awards values ('2015', 'ijk abc');

select a.main_contribution,cs.first_name,cs.last_name -- ,w.award_year

from computer_scienists cs inner join winners w on cs.scientists_id=w.scientists_id

inner join awards a on w.award_year=a.award_id

where w.award_year =2015;

select*from order2;
select*from customer2;
alter table order2 add foreign key(customer_id) references customer(id);

create table customer3(
id integer primary key auto_increment,
first_name varchar(20),
last_name varchar(20),
phone varchar(50),
email varchar(50)
);
create table order3(
id integer primary key auto_increment,
customer_id integer,
delivery_address varchar(100),
total_amount decimal(10,2),
constraint FK_customerOrder foreign key(customer_id) references customer3(id)
);

insert into customer3 values(1,	'vincent',	'lau'	,'852 12345678'	,'vincent@gmail.com');
insert into customer3 values(2,	'vincent',	'lau'	,'852 12345678'	,'vincent@gmail.com');
insert into customer3 values(3,	'vincent',	'lau'	,'852 12345678'	,'vincent@gmail.com');
insert into customer3 values(4,	'vincent',	'lau'	,'852 12345678'	,'vincent@gmail.com');

insert into order3 values (1, 2, 'ABC XYZ', 100.44);
insert into order3 values (2, 2, 'xxxABC XYZ', 22.88);
insert into order3 values (3, 1, 'aaABC XYZ', 12.12);
insert into order3 values (4, 3, 'aaAfffffBC XYZ', 90.12);
-- insert into order3 values (4, 5, 'aaAfffffBC XYZ', 90.12);

create view  order4
as
select customer_id
from order3;

select  * from order4;

create   table order14 as (
 -- order4);
 -- CREATE TABLE order14 AS
SELECT *
FROM order4;

insert into customer3 values(5,'sally','wong','852 12345678','sally@gmail.com');

select *
from customer3 c3 inner join order3 o3
on c3.id=o3.customer_id;

select *
from customer3 c3 left join order3 o3
on c3.id=o3.customer_id
where o3.customer_id is null;

select *
from customer3 c3 right join order3 o3
on c3.id=o3.customer_id;












