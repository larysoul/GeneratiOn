create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria (
id bigint auto_increment,
tipo varchar(255),
primary key(id)
);

insert into tb_categoria (tipo) values ("Construção");
insert into tb_categoria (tipo) values ("Decoração");
insert into tb_categoria (tipo) values ("Carpintaria");
insert into tb_categoria (tipo) values ("Ferramenta");

select * from tb_categoria;

create table tb_produto (
id bigint auto_increment,
nome varchar(255),
valor decimal(8,2),
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_produto(nome, valor, categoria_id) values ("Cimento", 28.90, 1);
insert into tb_produto(nome, valor, categoria_id) values ("Furadeira", 135.90, 3);
insert into tb_produto(nome, valor, categoria_id) values ("Argamassa", 16.99, 1);
insert into tb_produto(nome, valor, categoria_id) values ("Papel de Parede", 22.99, 2);
insert into tb_produto(nome, valor, categoria_id) values ("Lustre", 144.25, 2);
insert into tb_produto(nome, valor, categoria_id) values ("Serra", 108.90, 3);
insert into tb_produto(nome, valor, categoria_id) values ("Trena", 17.60, 4);
insert into tb_produto(nome, valor, categoria_id) values ("Kit de ferramentas", 128.90, 4);

select * from tb_produto;
select * from tb_produto where valor > 50;
select * from tb_produto where valor > 20 and valor < 130;
select * from tb_produto where nome like "C%";

select * from tb_produto inner join tb_categoria on tb_produto.categoria_id = tb_categoria.id;
select * from tb_produto where categoria_id = 4;