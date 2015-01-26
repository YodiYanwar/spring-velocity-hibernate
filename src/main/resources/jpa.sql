CREATE TABLE person(
	id int PRIMARY KEY AUTO_INCREMENT,
	nama varchar(50) not null,
	alamat varchar(100) not null,
	umur int not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8;