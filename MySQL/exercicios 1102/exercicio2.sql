create database db_ecommerce;
use db_ecommerce;
create table tb_produtos (
id bigint auto_increment,
nome varchar(255),
modelo varchar(255),
cor varchar(255),
tamanho int,
preco decimal(8,2),
primary key (id)
);

insert into tb_produtos (nome, modelo, cor, tamanho, preco)
values ("Royalz", "Salto Alto Fino", "Rosa", 38, 174.90);
insert into tb_produtos (nome, modelo, cor, tamanho, preco)
values ("Santa Lolla", "Scarpin", "Off-White", 37, 164.99);
insert into tb_produtos (nome, modelo, cor, tamanho, preco)
values ("Duda Machado", "Bota Cano Longo", "Vermelho", 38, 269.90);
insert into tb_produtos (nome, modelo, cor, tamanho, preco)
values ("Liszy", "Salto Agulha", "Metalizado Prata", 35, 389.90);
insert into tb_produtos (nome, modelo, cor, tamanho, preco)
values ("Vizzano", "Bico Fino", "Verde", 39, 159.99);
insert into tb_produtos (nome, modelo, cor, tamanho, preco)
values ("Lady Emme", "Salto Alto Grosso", "Preto Camurça", 40, 250.90);
insert into tb_produtos (nome, modelo, cor, tamanho, preco)
values ("Y.Project", "Court Shoe", "Azul", 34, 799.90);
insert into tb_produtos (nome, modelo, cor, tamanho, preco)
values ("Nubia", "Bota Plataforma", "Laranja", 38, 589.90);

select * from tb_produtos;
select * from tb_produtotb_produtoss where preco > 500;
select * from tb_produtos where preco < 500;

update tb_produtos set preco = 510 where id = 5;
delete from tb_produtos where id = 9;