drop table T_RD_USUARIO;
DROP SEQUENCE sequence_id_usuario; 


create sequence sequence_id_usuario
start with 1
increment by 1
maxvalue 99999
nocache
nocycle;

create table T_RD_USUARIO(
id_usuario integer primary key ,
nm_usuario varchar(100),
ds_email varchar(100),
ds_senha varchar (100)
);