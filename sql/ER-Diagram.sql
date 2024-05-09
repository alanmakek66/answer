use exercise1;
create database exercise1;

create table regions(
region_id   integer primary key,
region_name varchar(25)

);

alter table regions
change column regoin_name region_name varchar(25);


create table countries(
country_id varchar(2) primary key,
country_name varchar(40),
region_id integer unique,
foreign key(region_id) references regions(region_id)
);




create table locations(
locations_id integer primary key,
street_address varchar(25),
postal_code varchar(12),
city varchar(30),
state_province varchar(12),
country_id varchar (2),
foreign key(country_id) references countries(country_id)
);
create table departments(
department_id integer primary key,
department_name varchar(20),
manager_id integer,
location_id integer,
foreign key(location_id) references locations(locations_id)
);

create table job_history(
employee_id integer,
start_date date,
end_date date,
job_id varchar(10),
department_id integer,
primary key(employee_id,start_date),
foreign key (department_id) references departments(department_id),
foreign key(job_id) references jobs(job_id)
);
create table jobs(
job_id varchar(10),
job_title varchar(35),
min_salary integer,
max_salary integer,
primary key(job_id)
);
create table job_grades(
grade_level varchar(2),
lowest_sal integer,
high_sal integer,
primary key(grade_level)
);
create table employees(
employee_id integer,
first_name varchar(20),
last_name varchar(25),
email varchar(25),
phone_number varchar(20),
hire_date date,
job_id varchar(10),
salary integer,
commission_pct integer,
manager_id integer,
department_id integer,
primary key(employee_id),
foreign key(job_id) references jobs(job_id),
foreign key(department_id) references departments(department_id)
);

-- REGIONS
INSERT INTO REGIONS (REGION_ID, REGION_NAME) VALUES
(1, 'North America'),
(2, 'Europe'),
(3, 'Asia');

-- COUNTRIES
INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES
(1, 'United States', 1),
(2, 'United Kingdom', 2),
(3, 'Japan', 3);

-- LOCATIONS
INSERT INTO LOCATIONS (LOCATIONs_ID, STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE, COUNTRY_ID) VALUES
(1001, '123 Main St', '12345', 'New York', 'NY', 1),
(1002, '456 Elm St', '67890', 'London', NULL, 2),
(1003, '789 Oak St', '98765', 'Tokyo', NULL, 3);

-- DEPARTMENTS
INSERT INTO DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID) VALUES
(10, 'Sales', 101, 1001),
(20, 'HR', 102, 1002),
(30, 'IT', 103, 1003);

-- JOBS
INSERT INTO JOBS (JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY) VALUES
('SALESMAN', 'Salesman', 30000, 60000),
('HR_REP', 'HR Representative', 35000, 70000),
('IT_PROG', 'IT Programmer', 40000, 80000);

-- EMPLOYEES
INSERT INTO EMPLOYEES (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID) VALUES
(101, 'John', 'Doe', 'john@example.com', '123-456-7890', '2023-01-15', 'SALESMAN', 50000, 0.05, 103, 10),
(102, 'Jane', 'Smith', 'jane@example.com', '987-654-3210', '2023-02-20', 'HR_REP', 55000, 0.07, 103, 20),
(103, 'Michael', 'Johnson', 'michael@example.com', '555-123-4567', '2023-03-25', 'IT_PROG', 60000, 0.06, 103,30);

-- JOB_HISTORY
INSERT INTO JOB_HISTORY (START_DATE, END_DATE, JOB_ID, DEPARTMENT_ID, EMPLOYEE_ID) VALUES
('2023-01-15', '2023-05-15', 'SALESMAN', 10, 101),
('2023-02-20', '2023-06-20', 'HR_REP', 20, 102),
('2023-03-25', NULL, 'IT_PROG', 30, 103);

select loc.locations_id,loc.street_address,loc.city,loc.state_province,c.country_name
from locations loc left join countries c
on loc.country_id=c.country_id;

select first_name,last_name,department_id
from employees;

select e.first_name,e.last_name,e.job_id,e.DEPARTMENT_ID
from employees e left join departments d on e.DEPARTMENT_ID=d.DEPARTMENT_ID
left join locations loc on d.location_id=loc.locations_id
left join countries c on loc.country_id=c.country_id
where c.country_name ='Japan';

-- select employee_id,last_name
-- from

select e.first_name,e.last_name,e.hire_date
from employees e 
where e.hire_date>(SELECT hire_date
    FROM employees e1
    WHERE e1.first_name = 'lex' and e1.last_name='de haan'
);

select d.department_name,count(1)
from employees e left join departments d
on e.department_id=d.department_id
group by d.department_name;

select e.employee_id,j.job_title
from employees e left join jobs j
on e.job_id=j.job_id
left join job_history jh on jh.job_id=j.job_id
WHERE DATEDIFF(jh.start_date, jh.end_date) > 30;

select d.department_name, CONCAT(e.first_name, ' ', e.last_name)as manager_name,loc.city,c.country_name
from employees e left join departments d on  e.department_id=d.department_id
left join locations loc on d.location_id=loc.locations_id
left join countries c on loc.country_id= c.country_id
where e.employee_id =e.manager_id;

select e.department_id,avg(e.salary)
from employees e
group by e.department_id;

select a.employee_id, a.last_name, a.manager_id, b.last_name as manager_last_name 
from employees a left join employees b 
on a.manager_id = b.employee_id;













