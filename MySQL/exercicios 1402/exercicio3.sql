create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria (
id bigint auto_increment,
tipo varchar(255),
receita boolean,
primary key(id)
);

insert into tb_categoria (tipo, receita)
values ("Injetavél", true);
insert into tb_categoria (tipo, receita)
values ("Gotas", true);
insert into tb_categoria (tipo, receita)
values ("Comprimido", false);
insert into tb_categoria (tipo, receita)
values ("Xarope", false);

select * from tb_categoria;

create table tb_produto (
id bigint auto_increment,
nome varchar(255),
valor decimal(8,2),
validade varchar(255),
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_produto(nome, valor, validade, categoria_id)
values ("Dipirona", 3.95, "20/04/2023", 3);
insert into tb_produto(nome, valor, validade, categoria_id)
values ("Buscopan", 15.23, "15/02/2024", 2);
insert into tb_produto(nome, valor, validade, categoria_id)
values ("Benzetacil", 14.90, "26/12/2022", 1);
insert into tb_produto(nome, valor, validade, categoria_id)
values ("Omeprazol", 27.95, "01/01/2025", 1);
insert into tb_produto(nome, valor, validade, categoria_id)
values ("Bupropiona", 77.99, "16/06/2023", 3);
insert into tb_produto(nome, valor, validade, categoria_id)
values ("Histamin", 10.90, "12/05/2024", 4);

select * from tb_produto;
select * from tb_produto where valor > 60;
select * from tb_produto where valor > 3 and valor < 60;
select * from tb_produto where nome like "B%";

select * from tb_produto inner join tb_categoria on tb_produto.categoria_id = tb_categoria.id;
select * from tb_produto where categoria_id = 1;