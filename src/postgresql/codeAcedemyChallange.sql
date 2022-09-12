--CodeAcedemy Exercise
--HALIL GOKSU


---------------------1. Select each number as its opposite---------------------------------------
create table if not exists FirstQuestion(id int, number int);
select * from FirstQuestion ;

update FirstQuestion set number=number*-1;


---------------------2. Select all the divisions that have had revenue this year------------------------
create table if not exists revenuetable (Divisionid int, Year date, Revenue integer);
insert into revenue values(1,'01-01-2021',40);

select Divisionid from revenuetable where year>'2020,12,31' and Revenue>0;



----------------------3. Find the century for the year-----------------------------------------
create table century(id int, year date);
insert into century values(5,'01,01,1969');
select * from century;

select to_char(year, 'CCTH "Century"') from century; 


----------------------4. Even or odd------------------------------------------------------
create table EvenOdd(id int,Value int);
insert into EvenOdd values(5,47);
select * from EvenOdd;

select case
when value%2=0 then 'even' when value%2=1 then 'odd'
end as evenOrOdd from EvenOdd;


--------------------5. Group by age-----------------------------------------------------------
create table Groupbyage(id int,Name varchar(50),Age int);
insert into Groupbyage values(1,'Bob',50);
select * from Groupbyage;

select age, count(age) as count from Groupbyage group by Age order by Age;


--------------------6. Return a greeting string-----------------------------------------------
create table greeting(id int,Name varchar(50));
insert into greeting values(3,'sasdf');
select * from greeting;

select concat('Hi, ', name, '! How are you today?') from greeting; 



------------------------7. Find the best selling products------------
create table bestselling(id int,Name varchar(50),AmountSold int);
insert into bestselling values(2,'siz',2);
select * from bestselling;

select  name, AmountSold from bestselling order by AmountSold desc fetch first 5 rows only;


------------------------8. Who needs A passport------------------------
create table needsApassport(id int,Name varchar(50),Country varchar(50));
insert into needsApassport values(3,'Ben','United States');
select * from needsApassport;

select name from needsApassport where country != 'United States' and country != 'Canada';


----------------------9. Just the unique Values------------------------
create table uniqueValues(id int,Name varchar(50),Age int);
insert into uniqueValues values(1,'Halil',21);
select * from uniqueValues;

select distinct age from uniqueValues;


----------------------10. Add The Ages------------------------------
create table AddTheAges(id int,Name varchar(50),Age int);
insert into AddTheAges values(1,'Halil',21);
select * from AddTheAges;

select sum(age) from AddTheAges;














