create table student1(
	id integer primary key,
	student_name varchar(20),
	result_id integer,
	foreign key (result_id) references result1(result1_id)
	
	
)
create table result1(
	result1_id integer primary key,
	score integer
)
select * from student1;	
INSERT INTO student1 (id, student_name, result_id) VALUES (1, 'John Doe', 1);
INSERT INTO student1 (id, student_name, result_id) VALUES (2, 'Jane Smith', 2);
INSERT INTO student1 (id, student_name, result_id) VALUES (3, 'Michael Johnson', 3);
INSERT INTO student1 (id, student_name, result_id) VALUES (4, 'Emily Davis', 4);
INSERT INTO student1 (id, student_name, result_id) VALUES (5, 'David Wilson', 5);

INSERT INTO result1 (result1_id, score) VALUES (1, 85);
INSERT INTO result1 (result1_id, score) VALUES (2, 92);
INSERT INTO result1 (result1_id, score) VALUES (3, 78);
INSERT INTO result1 (result1_id, score) VALUES (4, 89);
INSERT INTO result1 (result1_id, score) VALUES (5, 95);

select s.student_name,r.score
from student1 s left join result1 r
on s.result_id=r.result1_id
order by r.result1_id asc
limit 3;

select student_name 
from student1;

select s.student_name,r.score
from student1 s left join result1 r
on s.result_id=r.result1_id
where r.score> 90;

CREATE TABLE order5 (
    order_id INT PRIMARY KEY,
    order_number VARCHAR(20),
    order_date DATE,
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES customer5(customer_id)
);

CREATE TABLE customer5 (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(50),
    email VARCHAR(50)
);

INSERT INTO customer5 (customer_id, customer_name, email) VALUES (1, 'John Doe', 'john.doe@example.com');
INSERT INTO customer5 (customer_id, customer_name, email) VALUES (2, 'Jane Smith', 'jane.smith@example.com');
INSERT INTO customer5 (customer_id, customer_name, email) VALUES (3, 'Michael Johnson', 'michael.johnson@example.com');

INSERT INTO order5 (order_id, order_number, order_date, customer_id) VALUES (1, 'ORD001', '2024-04-01', 1);
INSERT INTO order5 (order_id, order_number, order_date, customer_id) VALUES (2, 'ORD002', '2024-04-02', 1);
INSERT INTO order5 (order_id, order_number, order_date, customer_id) VALUES (3, 'ORD003', '2024-04-03', 2);

select c5.customer_name,o5.order_number
from customer5 c5 left join order5 o5
on c5.customer_id =o5.customer_id;

select c5.customer_name , o5.order_number
from customer5 c5 inner join order5 o5
on c5.customer_id =o5.customer_id;

select c5.customer_name,count(o5.order_id) as order_quantity
from customer5 c5 left join order5 o5
on c5.customer_id =o5.customer_id
group by c5.customer_name
order by order_quantity desc
limit 1;

 



