create database if not exists petdb;

drop table if exists PETS;

create table PETS (
  id int primary key not null auto_increment,
  name varchar(80) not null,
  age int not null
  );





