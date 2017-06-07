SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `practica2db` DEFAULT CHARACTER SET utf8 ;
USE `practica2db` ;

-- -----------------------------------------------------
-- Table `practica2db`.`centrodetrabajo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `practica2db`.`centrodetrabajo` ;

CREATE TABLE IF NOT EXISTS `practica2db`.`centrodetrabajo` (
  `idCentroDeTrabajo` INT(11) NOT NULL AUTO_INCREMENT,
  `nombreCentroDeTrabajo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCentroDeTrabajo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `practica2db`.`carrera`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `practica2db`.`carrera` ;

CREATE TABLE IF NOT EXISTS `practica2db`.`carrera` (
  `idCarrera` INT(11) NOT NULL AUTO_INCREMENT,
  `nombreCarrera` VARCHAR(45) NOT NULL,
  `duracion` INT(11) NULL DEFAULT NULL,
  `idCentroDeTrabajo` INT NOT NULL,
  PRIMARY KEY (`idCarrera`),
  INDEX `fk_carrera_centrodetrabajo1_idx` (`idCentroDeTrabajo` ASC),
  CONSTRAINT `fk_carrera_centrodetrabajo1`
    FOREIGN KEY (`idCentroDeTrabajo`)
    REFERENCES `practica2db`.`centrodetrabajo` (`idCentroDeTrabajo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `practica2db`.`alumno`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `practica2db`.`alumno` ;

CREATE TABLE IF NOT EXISTS `practica2db`.`alumno` (
  `matricula` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `nombreAlumno` VARCHAR(45) NOT NULL,
  `paternoAlumno` VARCHAR(45) NOT NULL,
  `maternoAlumno` VARCHAR(45) NOT NULL,
  `fechaNacimiento` DATE NOT NULL,
  `calle` VARCHAR(45) NULL DEFAULT NULL,
  `colonia` VARCHAR(45) NULL DEFAULT NULL,
  `numero` INT(11) NULL DEFAULT NULL,
  `codigoPostal` BIGINT(20) NULL DEFAULT NULL,
  `sexo` CHAR(1) NULL DEFAULT NULL,
  `eMail` VARCHAR(45) NULL DEFAULT NULL,
  `idCarrera` INT(11) NOT NULL,
  PRIMARY KEY (`matricula`),
  INDEX `fk_alumno_carrera1_idx` (`idCarrera` ASC),
  CONSTRAINT `fk_alumno_carrera1`
    FOREIGN KEY (`idCarrera`)
    REFERENCES `practica2db`.`carrera` (`idCarrera`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `practica2db`.`materias`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `practica2db`.`materias` ;

CREATE TABLE IF NOT EXISTS `practica2db`.`materias` (
  `idMaterias` INT(11) NOT NULL AUTO_INCREMENT,
  `nombreMateria` VARCHAR(45) NULL DEFAULT NULL,
  `creditos` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`idMaterias`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `practica2db`.`examen`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `practica2db`.`examen` ;

CREATE TABLE IF NOT EXISTS `practica2db`.`examen` (
  `idExamen` INT(11) NOT NULL AUTO_INCREMENT,
  `fecha` DATE NULL DEFAULT NULL,
  `idMaterias` INT(11) NOT NULL,
  PRIMARY KEY (`idExamen`),
  INDEX `fk_examen_materias1_idx` (`idMaterias` ASC),
  CONSTRAINT `fk_examen_materias1`
    FOREIGN KEY (`idMaterias`)
    REFERENCES `practica2db`.`materias` (`idMaterias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `practica2db`.`preguntas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `practica2db`.`preguntas` ;

CREATE TABLE IF NOT EXISTS `practica2db`.`preguntas` (
  `idPregunta` INT(11) NOT NULL AUTO_INCREMENT,
  `pregunta` VARCHAR(100) NULL DEFAULT NULL,
  `idExamen` INT(11) NOT NULL,
  PRIMARY KEY (`idPregunta`),
  INDEX `fk_respuestas_examen1_idx` (`idExamen` ASC),
  CONSTRAINT `fk_respuestas_examen1`
    FOREIGN KEY (`idExamen`)
    REFERENCES `practica2db`.`examen` (`idExamen`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `practica2db`.`respuestas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `practica2db`.`respuestas` ;

CREATE TABLE IF NOT EXISTS `practica2db`.`respuestas` (
  `idRespuestas` INT(11) NOT NULL AUTO_INCREMENT,
  `Respuesta` VARCHAR(100) NULL DEFAULT NULL,
  `idPregunta` INT(11) NOT NULL,
  PRIMARY KEY (`idRespuestas`),
  INDEX `fk_respuestas_respuestas1_idx` (`idPregunta` ASC),
  CONSTRAINT `fk_respuestas_respuestas1`
    FOREIGN KEY (`idPregunta`)
    REFERENCES `practica2db`.`preguntas` (`idPregunta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `practica2db`.`calificaciones`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `practica2db`.`calificaciones` ;

CREATE TABLE IF NOT EXISTS `practica2db`.`calificaciones` (
  `idCalificaciones` INT(11) NOT NULL AUTO_INCREMENT,
  `puntaje` DOUBLE NULL DEFAULT NULL,
  `idExamen` INT(11) NOT NULL,
  `matricula` BIGINT(20) NOT NULL,
  PRIMARY KEY (`idCalificaciones`),
  INDEX `fk_calificaciones_alumno1_idx` (`matricula` ASC),
  INDEX `fk_calificaciones_examen1_idx` (`idExamen` ASC),
  CONSTRAINT `fk_calificaciones_alumno1`
    FOREIGN KEY (`matricula`)
    REFERENCES `practica2db`.`alumno` (`matricula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_calificaciones_examen1`
    FOREIGN KEY (`idExamen`)
    REFERENCES `practica2db`.`examen` (`idExamen`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
