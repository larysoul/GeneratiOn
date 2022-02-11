create database db_rh;
use db_rh;
create table tb_funcionaries (
id bigint auto_increment,
nome varchar(255),
idade int,
genero varchar(255),
cargo varchar(255),
salario decimal(8,2),
primary key (id)
);

insert into tb_funcionaries (nome, idade, genero, cargo, salario)
values ("Scar", 25, "Masculino", "Dev Junior", 1800);
insert into tb_funcionaries (nome, idade, genero, cargo, salario)
values ("Rita", 24, "Feminino", "Dev Pleno", 7000);
insert into tb_funcionaries (nome, idade, genero, cargo, salario)
values ("Matheus", 30, "Masculino", "Dev Sênior", 10000);
insert into tb_funcionaries (nome, idade, genero, cargo, salario)
values ("Wendel", 19, "Masculino", "Estágiario", 1500);
insert into tb_funcionaries (nome, idade, genero, cargo, salario)
values ("Lary", 19, "Feminino", "Dev Junior", 2000);

select * from tb_funcionaries;
select * from tb_funcionaries where salario > 2000;
select * from tb_funcionaries where salario < 2000;

update tb_funcionaries set salario = 2500 where id = 5;
