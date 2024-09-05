use POS;

create table user_table
(NIC varchar(20)PRIMARY KEY,Address varchar(40) not null,Name varchar(40) not null,TP int not null,username varchar(20)not null,password varchar(20)not null);

create table item_table
(Barcode varchar(12)NOT NULL primary key,Invoice_No varchar(17)NOT NULL,Date date NOT NULL,sup_name varchar(40) NOT NULL,Item_name varchar(28) NOT NULL,Category varchar(28) NOT NULL,Buying_price money NOT NULL,Selling_price money NOT NULL,Qty int NOT NULL,Total_cost money NOT NULL );

create table return_item
(Barcode varchar(12)NOT NULL,Invoice_No varchar(17)NOT NULL,Date date NOT NULL,sup_name varchar(40) NOT NULL,Item_name varchar(28) NOT NULL,Category varchar(28) NOT NULL,Buying_price money NOT NULL,Selling_price money NOT NULL,Qty int NOT NULL,Total_cost money NOT NULL );

create table damage_item
(Barcode varchar(12)NOT NULL,Invoice_No varchar(17)NOT NULL,Date date NOT NULL,sup_name varchar(40) NOT NULL,Item_name varchar(28) NOT NULL,Category varchar(28) NOT NULL,Buying_price money NOT NULL,Selling_price money NOT NULL,Qty int NOT NULL,Total_cost money NOT NULL );

drop table damage_item;

create table sold_item
(Sold_date date NOT NULL,Barcode varchar(12)NOT NULL,Bill_No varchar(17)NOT NULL,Item_name varchar(28) NOT NULL,Category varchar(28) NOT NULL,Buying_price money NOT NULL,Sold_Amount money NOT NULL,Qty int NOT NULL,Total_Amount money NOT NULL );


insert into user_table
values(88888888,'Kandy','sanjaya',0123456789,'user','pass');

select*from user_table;