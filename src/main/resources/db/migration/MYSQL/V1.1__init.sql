

CREATE TABLE `usuarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  `documento` VARCHAR(20) NOT NULL,
  `email` VARCHAR(45) NULL,
  `password` VARCHAR(100) NOT NULL,
  `admin` BIT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`));

insert into usuarios (nombre,documento,email,password,admin) values ('Willian Rodriguez','222222','wwrrss@gmail.com','$2a$04$Mj6X6yG1f9Xx4yf9cwNmUO/66h6YVUTgRK9y6unvHzA1yqP8DPqAa',TRUE );
insert into usuarios (nombre,documento,email,password,admin) values ('Juan Perez','222222','jp@gmail.com','$2a$12$f6ywfvF6q.dYqR0x6U6z8eEyEeeYaXuveDj1wY.Nb4UEc/0f6OX.u',FALSE );


