use d71cqm2gr31vgh;

select * from persona;

select * from usuario;

select * from rol;


update usuario 
set password = $2a$10$2Iq5K5oRs9hL2Akn/eOFWO.8a86rS4VC3TbtFIeLQ4pM5y6MMe2SK 
where id_usuario = 1;

update usuario set password = where id_usuario = 2;

insert into usuario(username, password) values
    ('admin','$2a$10$O0XuWA/rQITSiIkiccP0n.mFnjK1N0zEj.NNfGD5spGf.Jg6EEBIe'),
    ('user','$2a$10$F4W.vbu0GKbd3sUz2qOED.0F5FaBA898iLd4iy9uAYvh50HegUC7e'),
    ('sharbel','$2a$10$dHAEi7BK951YkDRTDdziaOMgsBdZbeLDSZwTj9W7La5KH.Efa77M2');

insert into rol(nombre, id_usuario) values
    ('ROLE_ADMIN','1'),
    ('ROLE_USER','1'),
    ('ROLE_USER','2'),
    ('ROLE_ADMIN','3'),
    ('ROLE_USER','3');

