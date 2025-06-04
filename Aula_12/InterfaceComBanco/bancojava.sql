create database bancojava;

use bancojava;

create table usuario(
idusuario int not null primary key auto_increment,
nome varchar(100) not null,
usuario varchar(15) not null,
senha varchar(15) not null
);

create table cliente(
idcliente int not null primary key auto_increment,
nome varchar(100) not null,
cpf varchar(20) not null,
data date not null,
sexo varchar(10)
);

insert into usuario(nome, usuario, senha) values("Lidiane", "admin", "1234");