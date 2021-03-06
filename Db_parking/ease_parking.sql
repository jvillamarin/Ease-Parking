-- MySQL Script generated by MySQL Workbench
-- Sun Oct 10 21:45:53 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Operarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Operarios` (
  `idOperarios` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(16) NOT NULL,
  `password` VARCHAR(32) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `email` VARCHAR(255) NULL,
  `tipo_identificacion` VARCHAR(45) NOT NULL,
  `identificacion` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NULL,
  UNIQUE INDEX `id_usuario_UNIQUE` (`idOperarios` ASC) VISIBLE,
  PRIMARY KEY (`idOperarios`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Plazas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Plazas` (
  `idPlazas` INT NOT NULL AUTO_INCREMENT,
  `tipoPlaza` VARCHAR(10) NOT NULL,
  `codigoPlaza` VARCHAR(10) NOT NULL,
  `libre` TINYINT NULL DEFAULT 1,
  PRIMARY KEY (`idPlazas`),
  UNIQUE INDEX `codigoPlaza_UNIQUE` (`codigoPlaza` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Vehiculos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Vehiculos` (
  `idVehiculos` INT NOT NULL AUTO_INCREMENT,
  `placa` VARCHAR(255) NOT NULL,
  `tipoVehiculo` VARCHAR(45) NOT NULL,
  `idPlazasVehiculo` INT NOT NULL,
  `horaEntrada` DATE NOT NULL,
  `horaSalida` DATE NULL,
  PRIMARY KEY (`idVehiculos`),
  INDEX `vehiculoPlaza_idx` (`idPlazasVehiculo` ASC) VISIBLE,
  UNIQUE INDEX `idPlazasVehiculo_UNIQUE` (`idPlazasVehiculo` ASC) VISIBLE,
  CONSTRAINT `vehiculoPlaza`
    FOREIGN KEY (`idPlazasVehiculo`)
    REFERENCES `mydb`.`Plazas` (`idPlazas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `mydb`.`Facturas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Facturas` (
  `idFacturas` INT NOT NULL AUTO_INCREMENT,
  `idVehiculosFacturas` INT NOT NULL,
  `valorTotal` DOUBLE NOT NULL,
  `Operarios_id` INT NOT NULL,
  PRIMARY KEY (`idFacturas`),
  UNIQUE INDEX `idFactura_UNIQUE` (`idFacturas` ASC) VISIBLE,
  INDEX `vehiculosFactura_idx` (`idVehiculosFacturas` ASC) VISIBLE,
  INDEX `fk_Facturas_Operarios1_idx` (`Operarios_id` ASC) VISIBLE,
  CONSTRAINT `vehiculosFactura`
    FOREIGN KEY (`idVehiculosFacturas`)
    REFERENCES `mydb`.`Vehiculos` (`idVehiculos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Facturas_Operarios1`
    FOREIGN KEY (`Operarios_id`)
    REFERENCES `mydb`.`Operarios` (`idOperarios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
