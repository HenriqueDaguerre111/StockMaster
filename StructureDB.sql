CREATE SCHEMA `stockmaster` DEFAULT CHARACTER SET utf8 ;

use stockmaster;
CREATE TABLE `stockmaster`.`produtos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `descricao` VARCHAR(200) NULL,
  `valor` FLOAT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);
  
  
  
INSERT INTO `stockmaster`.`produtos` (`nome`, `descricao`, `valor`) VALUES ('Teclado e mouse sem fio Dell Pro — KM5221W', 'Mouse com leitor óptico', '209');
INSERT INTO `stockmaster`.`produtos` (`nome`, `descricao`, `valor`) VALUES ('Monitor Dell de 27\" P2722H, Preto', 'Monitor LCD com retroiluminação LED - 27\"', '1499');

