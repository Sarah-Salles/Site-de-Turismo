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

CREATE TABLE Passagens (
Id INTEGER PRIMARY KEY auto_increment,
Valor int,
Desconto int,
Valor_Promocional int,
Data_Ida DATETIME,
Data_Volta DATETIME,
Id_Cidade int,
FOREIGN KEY(Id_Cidade) REFERENCES Cidades (Id)
);

select * from passagens;
