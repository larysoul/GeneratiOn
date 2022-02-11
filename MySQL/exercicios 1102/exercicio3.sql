create database db_escola2;
use db_escola2;
create table tb_alunos2 (
id bigint auto_increment,
nome varchar(255),
idade int,
turma varchar (255),
nota decimal(8,1),
primary key (id)
);

insert into tb_alunos2 (nome, idade, turma, nota)
values ("Scar", 15, "1-A", 10);
insert into tb_alunos2 (nome, idade, turma, nota)
values ("Rita", 16, "2-C", 8.5);
insert into tb_alunos2 (nome, idade, turma, nota)
values ("Ana", 17, "3-A", 6.5);
insert into tb_alunos2 (nome, idade, turma, nota)
values ("Jonathas", 13, "9-B", 5.0);
insert into tb_alunos2 (nome, idade, turma, nota)
values ("Wendel", 15, "1-A", 8.0);
insert into tb_alunos2 (nome, idade, turma, nota)
values ("Denize", 17, "3-D", 3.2);
insert into tb_alunos2 (nome, idade, turma, nota)
values ("Maria", 18, "3-A", 9.6);
insert into tb_alunos2 (nome, idade, turma, nota)
values ("Lary", 15, "1-B", 10);

select * from tb_alunos2;
select * from tb_alunos2 where nota > 7;
select * from tb_alunos2 where nota < 7;

update tb_alunos2 set nota = 10 where id = 7;