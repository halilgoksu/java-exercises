

--- Select all records from the Employee table
select * from "Employee" e ;

--Select all records from the Employee table where last name is King
select * from "Employee" e 
where "LastName" like 'King';

--Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
select * from "Employee" e 
where "FirstName" like 'Andrew'
and   "ReportsTo" = NULL;	

--Select all albums in Album table and sort result set in descending order by title.
select * from "Album" a 
order by "Title" desc;

--Select first name from Customer and sort result set in ascending order by city
select "FirstName"  from "Customer" c 
order by "City";

--Select all invoices with a billing address like “T%”
select * from "Invoice" i 
where "BillingAddress" like 'T%';

--Select all invoices that have a total between 15 and 50
select * from "Invoice" i 
where "Total" >= 15 and "Total" <= 50;

--Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from "Employee" e 
where "HireDate" >= '01-01-2003' and "HireDate" <= '01-03-2004';


--Insert two new records into Genre table
insert into "Genre" values(26, 'Michael Jackson');
insert into "Genre" values(27, 'EDM');

--Insert two new records into Employee table
insert into "Employee" values(9, 'JackStone', 'Revivo', 'Teacher', '6', '01-01-1940', '01-08-2022', '6', 'dont', 'ZZ', 'Tukiye', '2101', '44277777', null, 'asad@gmail.com');
insert into "Employee" values(10, 'Ronaldo', 'Christiano', 'Best player', '6', '01-01-2001', '01-08-2022', 'Loser Road 24', 'Co', 'De', 'Portogal', '80210', '2114214', null, 'sdsds@gmail.com');

--Insert two new records into Customer table
insert into "Customer" values(60,'Dani', 'Alves', null, 'Center of ', 'Besni', null, 'Kurdistan', '414253541', '414253541', null, 'dfdfdsf@gmail.com', 5);
insert into "Customer" values(61, 'Enes', 'Gor', null, 'Engelewood', 'Denver', null, 'Turkiye', '80000', '+414253541', null, 'dfdsfas@gmail.com', 3);


--Update Aaron Mitchell in Customer table to Robert Walter
update "Customer" 
set "FirstName" = 'Robert', "LastName" = 'Walter'
where "FirstName" = 'Aaron' and "LastName" = 'Mitchell';

--Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
update "Artist" 
set "Name" = 'CCR'
where "Name" = 'Creedence Clearwater Revival';