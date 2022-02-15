create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
ciencias varchar(255),
formato varchar(255),
primary key (id)
);

insert into tb_categoria (ciencias, formato) values ("Exatas", "Online");
insert into tb_categoria (ciencias, formato) values ("Humanas", "Presencial");
insert into tb_categoria (ciencias, formato) values ("Biológicas", "Online");
insert into tb_categoria (ciencias, formato) values ("Tecnológicas", "Presencial");

select * from tb_categoria;

create table tb_curso (
id bigint auto_increment,
nome varchar(255) not null,
valor decimal(8,2),
duracao varchar(255),
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_curso (nome, valor, duracao, categoria_id) 
values ("Curso JAVA", 220, "3 meses", 4);
insert into tb_curso (nome, valor, duracao, categoria_id) 
values ("Curso Literatura", 150, "5 meses", 2);
insert into tb_curso (nome, valor, duracao, categoria_id) 
values ("Curso Calculo III", 99.90, "3 meses", 1);
insert into tb_curso (nome, valor, duracao, categoria_id) 
values ("Curso Química Orgânica", 125, "3 meses", 3);
insert into tb_curso (nome, valor, duracao, categoria_id) 
values ("Curso HTML", 68.99, "2 meses", 4);

select * from tb_curso;
select * from tb_curso where valor > 100;
select * from tb_curso where valor > 30 and valor < 100;
select * from tb_curso where nome like "%a";

select * from tb_curso inner join tb_categoria on tb_curso.categoria_id = tb_categoria.id;
select * from tb_curso where categoria_id = 4;