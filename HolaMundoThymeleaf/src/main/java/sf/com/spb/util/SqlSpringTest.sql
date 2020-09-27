use practicasspringb;

select * from persona;

select * from usuario;

select * from rol;


update usuario 
set password = $2a$10$2Iq5K5oRs9hL2Akn/eOFWO.8a86rS4VC3TbtFIeLQ4pM5y6MMe2SK 
where id_usuario = 1;

update usuario set password = where id_usuario = 2;