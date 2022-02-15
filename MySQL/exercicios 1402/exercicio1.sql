create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe (
id bigint auto_increment,
raridade varchar(255),
elemento varchar(255),
arma varchar(255),
nacao varchar(255),
primary key(id)
);

insert into tb_classe (raridade, elemento, arma, nacao)
values ("5* estrelas", "Geo", "Sword", "Mondstand");
insert into tb_classe (raridade, elemento, arma, nacao)
values ("5* estrelas", "Pyro", "Claymore", "Liyue");
insert into tb_classe (raridade, elemento, arma, nacao)
values ("4* estrelas", "Electro", "Catalyst", "Inazuma");
insert into tb_classe (raridade, elemento, arma, nacao)
values ("5* estrelas", "Hydro", "Bow", "Sneznhaya");
insert into tb_classe (raridade, elemento, arma, nacao)
values ("4* estrelas", "Cryo", "Polearm", "Liyue");

select * from tb_classe;

create table tb_personagens (
id bigint auto_increment,
nome varchar(255),
nivel int,
adRank varchar(255),
ataque decimal(8,2),
defesa decimal(8,2),
vida decimal(8,2),
classe_id bigint,
primary key(id),
foreign key(classe_id) references tb_classe(id)
);

insert into tb_personagens (nome, nivel, adRank, ataque, defesa, vida, classe_id)
values ("Albedo", 90, "AR 46", 10001, 2791, 20929, 1);
insert into tb_personagens (nome, nivel, adRank, ataque, defesa, vida, classe_id)
values ("Zhongli", 90, "AR 50", 1553, 921, 22599, 5);
insert into tb_personagens (nome, nivel, adRank, ataque, defesa, vida, classe_id)
values ("Diluc", 90, "AR 55", 3063, 996, 19495, 2);
insert into tb_personagens (nome, nivel, adRank, ataque, defesa, vida, classe_id)
values ("Tartaglia", 90, "AR 56", 1619, 1065, 23329, 4);
insert into tb_personagens (nome, nivel, adRank, ataque, defesa, vida, classe_id)
values ("Chongyun", 55, "AR 49", 2987, 1000, 10876, 3);
insert into tb_personagens (nome, nivel, adRank, ataque, defesa, vida, classe_id)
values ("Rosaria", 90, "AR 52", 3467, 1924, 20999, 5);


select * from tb_personagens;
select * from tb_personagens where ataque > 2000;
select * from tb_personagens where defesa > 1000 and defesa < 2000;
select * from tb_personagens where nome like "C%";

select * from tb_personagens inner join tb_classe on tb_personagens.classe_id = tb_classe.id;

select * from tb_personagens where classe_id = 5;