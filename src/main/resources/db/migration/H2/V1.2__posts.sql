

CREATE TABLE `posts` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_usuario` INT NOT NULL,
  `texto` VARCHAR(500) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`id_usuario`)
  REFERENCES usuarios(`id`)
  ON DELETE RESTRICT ON UPDATE CASCADE
  );

insert into posts (id_usuario,texto) VALUES (1,'Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can JUST RUN');
insert into posts (id_usuario,texto) VALUES (2,'Most Spring Boot applications need very little Spring configuration.');
