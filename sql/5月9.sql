use sys;
-- union
select 'hello' as abc from dual
union
select' good' as aaa from dual;

-- union all 重複
select 'hello' as abc from dual
union all
select' hello' as aaa from dual;

drop table student2;
drop table teacher2;
drop table subject2;
drop table student_subject;


create table student2 (
	id integer primary key auto_increment,
    first_name varchar(20),
    last_name varchar(20)
);

create table teacher2 (
	id integer primary key auto_increment,
    first_name varchar(20),
    last_name varchar(20)
);

create table subject2 (
	id integer primary key auto_increment,
    description varchar(20)
);

create table student_subject (
	id integer primary key auto_increment,
    student_id integer,
    subject_id integer,
    foreign key (student_id) references student2(id),
    foreign key (subject_id) references subject2(id)
);
insert into student2 values (1, 'Vincent', 'Lau');
insert into student2 values (2, 'ABC', 'Chan');

insert into subject2 values (1, 'Maths');
insert into subject2 values (2, 'English');

insert into student_subject values (1, 1, 2);

insert into teacher2 values (1, 'XYZ', 'Lau');
insert into teacher2 values (2, 'ABC', 'Chan');
insert into teacher2 values (3, 'IJK', 'Lo');
insert into teacher2 values (4, 'vincent', 'lau');

select first_name,last_name
from student2
union all select first_name,last_name
from teacher2;

select first_name,last_name
from student2
union all 
select last_name,first_name
from teacher2;

create table student_subject2(
id integer primary key auto_increment,
subject_id integer not null,
student_id integer
);

insert into student_subject2 values(1,null,1);
insert into student_subject2 values(2,1,null);

create view student_view
as select*from student2 where last_name in('lau','chan');

select*from student_view;
insert into student2 values(3,'sally','chan');





