create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria (
id bigint auto_increment,
pagamento varchar(255),
retirada varchar(255),
troco boolean,
primary key(id)
);

insert into tb_categoria(pagamento, retirada, troco)
values("Cartão", "Entrega", false);
insert into tb_categoria(pagamento, retirada, troco)
values("Dinheiro", "Entrega", true);
insert into tb_categoria(pagamento, retirada, troco)
values("Vale Refeição", "Entrega", false);
insert into tb_categoria(pagamento, retirada, troco)
values("Dinheiro", "Entrega", false);
insert into tb_categoria(pagamento, retirada, troco)
values("Cartão débito", "No local", false);

select * from tb_categoria;

create table tb_pizza (
id bigint auto_increment,
sabor varchar(255),
tamanho varchar(255),
borda varchar(255),
bebida varchar(255),
preco decimal(8,2),
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_pizza (sabor, tamanho, borda, bebida, preco, categoria_id)
values ("Calabresa", "Familia", "Vulcão", "Coca-Cola", 46.00, 3);
insert into tb_pizza (sabor, tamanho, borda, bebida, preco, categoria_id)
values ("Catupiry", "Grande", "Simples", "Fanta Uva", 42.00, 1);
insert into tb_pizza (sabor, tamanho, borda, bebida, preco, categoria_id)
values ("Mussarela", "Broto", "Recheada", "Pepsi", 40.00, 4);
insert into tb_pizza (sabor, tamanho, borda, bebida, preco, categoria_id)
values ("Bacon", "Normal", "Turbo", "Convenção Frutaina", 48.00, 3);
insert into tb_pizza (sabor, tamanho, borda, bebida, preco, categoria_id)
values ("Portuguesa", "Familia", "Premium", "Fanta Laranja", 49.00, 2);
insert into tb_pizza (sabor, tamanho, borda, bebida, preco, categoria_id)
values ("Frango c/ Catupiry", "Grande", "Sem Borda", "Tubaina", 46.00, 5);
insert into tb_pizza (sabor, tamanho, borda, bebida, preco, categoria_id)
values ("Mexicana", "Familia", "Vulcão", "Convenção Guaraná", 41.00, 2);
insert into tb_pizza (sabor, tamanho, borda, bebida, preco, categoria_id)
values ("Marguerita", "Normal", "Simples", "Coca-Cola", 42.00, 5);

select * from tb_pizza;
select * from tb_pizza where preco > 45;
select * from tb_pizza where preco > 29 and preco < 60;
select * from tb_pizza where sabor like "C%";

select * from tb_pizza inner join tb_categoria on tb_pizza.categoria_id = tb_categoria.id;

select * from tb_pizza where tamanho = "Familia";
