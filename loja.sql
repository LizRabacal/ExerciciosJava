create database loja;
use loja;

create table cliente(
	id int auto_increment primary key,
    nome varchar(30),
    dtniver date
);

create table compra(
	id int auto_increment primary key,
    id_cliente int,
    total float,
    constraint fk_id_cliente foreign key(id_cliente) references cliente(id)
);

create table produto(
	id int auto_increment primary key,
    preco float
);

alter table produto add column nome varchar(30);

create table itensvenda(
	id int auto_increment primary key,
    qtd int unsigned,
    id_produto int,
    id_compra int,
    subtotal float,
    constraint fk_id_produto foreign key(id_produto) references produto(id),
	constraint fk_id_compra foreign key(id_compra) references compra(id)

);


 DELIMITER //

create trigger calcular_subtotal before insert on itensvenda for each row
begin 
	declare subt float;
		select preco into subt from produto where id = NEW.id_produto;
        
        set NEW.subtotal = new.qtd * subt;
	end;
// 

DELIMITER ;


DELIMITER //

create trigger calcular_total after insert on itensvenda for each row
begin 
	declare subt float;
	select sum(subtotal) into subt from itensvenda where id_compra = NEW.id_compra;
        
     update compra set total = subt where id = NEW.id_compra; 
	end;
//
 DELIMITER ;
 
 
 
 insert into cliente (nome, dtniver) values ("Maria", "2002-05-12"),("Joao da Silva", "2003-02-10"),("Matheus Arrais", "2003-01-15");
 insert into produto (nome, preco) values ("Perfume", 45.60),("Pente", 15.60),("Escova", 21.80);
 insert into compra(id_cliente) values (4), (5), (6);
 insert into itensvenda(id_compra, id_produto, qtd) values (4, 2, 3);
  insert into itensvenda(id_compra, id_produto, qtd) values (4, 1, 2);
  
  
   insert into itensvenda(id_compra, id_produto, qtd) values (8, 2, 3);
  insert into itensvenda(id_compra, id_produto, qtd) values (8, 1, 2);
  
 insert into itensvenda(id_compra, id_produto, qtd) values (5, 3, 3);
  insert into itensvenda(id_compra, id_produto, qtd) values (5, 2, 1);
  
 select * from cliente;
 select * from compra;
 select * from itensvenda;
 select * from produto;
 
 -- OBTER TOTAL A PARTIR DE GROUP BY
 select id_compra, sum(subtotal) as total from itensvenda group by id_compra;
 
 -- OBTER A QUANTIDADE TOTAL DE VENDAS DOS PRODUTOS 
  select id_produto, sum(qtd) as qtd_produtos_vendidos from itensvenda group by id_produto;
  
  -- OBTER O NOME DO CLIENTE E O TOTAL DE CADA COMPRA FEITA PELO CLIENTE COM INNER JOIN
  select cliente.nome, compra.total from cliente inner join compra on cliente.id = compra.id_cliente;
  
    -- OBTER O NOME DO CLIENTE E O TOTAL DE TODAS AS COMPRA FEITA PELO CLIENTE COM INNER JOIN E GROUP BY
  select cliente.nome, sum(compra.total) as total_de_valor_gasto_em_compras from cliente 
  inner join compra on compra.id_cliente = cliente.id group by (id_cliente);
  
  create view total_gasto_em_compras as select cli.nome, sum(c.total) from cliente cli 
  inner join compra c on c.id_cliente = cli.id group by id_cliente;

select *  from total_gasto_em_compras;
  
