/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  maumneto
 * Created: 8 de jun. de 2023
 */

CREATE TABLE usuarios (
    id BIGINT NOT NULL AUTO_INCREMENT, 
    nome VARCHAR(255),
    email VARCHAR(255),
    endereco VARCHAR(255),
    dataNascimento DATE,
    PRIMARY KEY(id)
);

CREATE PROCEDURE SelectAllData ()
BEGIN
    SELECT * FROM usuarios;
END
