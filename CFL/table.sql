create database testdb02;
use testdb02;
create table student(name varchar(20), marks int(3));
insert into student values ('sreejith',99),('stebin',79),('satya',89),('prince',85);
select * from student;
show databases;
DROP DATABASE testdb01_backup;