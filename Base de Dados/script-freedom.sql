create database freedom;
use freedom;

CREATE TABLE Cidades (
Id int PRIMARY KEY auto_increment,
Nome VARCHAR(30),
Estado CHAR(2),
Pais VARCHAR(20),
Continente VARCHAR(20),
Descricao VARCHAR(255)
);

insert into cidades(nome,estado,pais,continente) values("Salvador","BA","Brasil","America do Sul");
insert into cidades(nome,estado,pais,continente) values("Duque de Caxias","RJ","Brasil","America do Sul");
insert into cidades(nome,estado,pais,continente) values("São Paulo","SP","Brasil","America do Sul");
insert into cidades(nome,estado,pais,continente) values("Recife","PE","Brasil","America do Sul");
insert into cidades(nome,estado,pais,continente) values("Fortaleza","CE","Brasil","America do Sul");
insert into cidades(nome,estado,pais,continente) values("Rio de Janeiro","RJ","Brasil","America do Sul");
insert into cidades(nome,estado,pais,continente) values("Brasília","DF","Brasil","America do Sul");
insert into cidades(nome,estado,pais,continente) values("Toronto","ON","Canadá","America do Norte");

SELECT * FROM cidades;

CREATE TABLE Passagem (
Id INTEGER PRIMARY KEY auto_increment,
Valor double,
Desconto int,
Valor_Promocional double,
Data_Ida DATE,
Data_Volta DATE,
Id_Cidade int,
FOREIGN KEY(Id_Cidade) REFERENCES Cidades (Id)
);

select * from passagem;

insert into passagem(valor,desconto,valor_promocional,data_ida,data_volta,id_cidade) values(400,0,400,"2022-10-20","2022-10-26",4);
insert into passagem(valor,desconto,valor_promocional,data_ida,data_volta,id_cidade) values(550,0,550,"2022-9-11","2022-9-16",2);
insert into passagem(valor,desconto,valor_promocional,data_ida,data_volta,id_cidade) values(750,0,750,"2022-12-05","2022-12-12",6);
insert into passagem(valor,desconto,valor_promocional,data_ida,data_volta,id_cidade) values(3000,0,3000,"2022-11-06","2022-11-12",8);