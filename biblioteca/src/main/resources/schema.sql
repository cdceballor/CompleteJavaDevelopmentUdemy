DROP TABLE IF EXISTS BIBLIOTECATABLA;
CREATE TABLE BIBLIOTECATABLA (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, idUser VARCHAR(10) NOT NULL, isbn VARCHAR(10) NOT NULL, tipoUsuario INT);
INSERT INTO BIBLIOTECATABLA (idUser, isbn, tipoUsuario) VALUES('12357342','2Col', 1);
INSERT INTO BIBLIOTECATABLA (idUser, isbn, tipoUsuario) VALUES('23656567','3Col', 1);