create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria (
id bigint auto_increment,
descricao varchar(255),
primary key(id)
);

insert into tb_categoria (descricao) values ("Aves");
insert into tb_categoria (descricao) values ("Bovinos");
insert into tb_categoria (descricao) values ("Suínos");

select * from tb_categoria;

create table tb_produto (
id bigint auto_increment,
nome varchar(255),
valor decimal(8,2),
quantidade int,
validade varchar(255),
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_produto (nome, valor, quantidade, validade, categoria_id)
values ("T-Bone", 71.73, 26, "20/02/2022", 2);
insert into tb_produto (nome, valor, quantidade, validade, categoria_id)
values ("Pernil", 25.99, 30, "22/02/2022", 3);
insert into tb_produto (nome, valor, quantidade, validade, categoria_id)
values ("Peito c/ Osso", 16.45, 22, "19/02/2022", 1);
insert into tb_produto (nome, valor, quantidade, validade, categoria_id)
values ("Lombo", 49.99, 10, "21/02/2022", 3);
insert into tb_produto (nome, valor, quantidade, validade, categoria_id)
values ("Coração de galinha", 28.79, 100, "24/02/2022", 1);
insert into tb_produto (nome, valor, quantidade, validade, categoria_id)
values ("Prime Rib", 85.20, 12, "28/02/2022", 2);

select * from tb_produto;
select * from tb_produto where valor > 60;
select * from tb_produto where valor > 30 and valor < 60;
select * from tb_produto where nome like "P%";

select * from tb_produto inner join tb_categoria on tb_produto.categoria_id = tb_categoria.id;
select * from tb_produto where categoria_id = 3;