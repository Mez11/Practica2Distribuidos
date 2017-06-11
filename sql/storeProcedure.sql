DELIMITER $$
CREATE PROCEDURE Grafiquita()
BEGIN
    SELECT COUNT(*) AS alumnosTotales, a.nombreAlumno AS Alumno 
    FROM alumnos AS a
    INNER JOIN carrera AS c
    ON a.matricula = c.idCarrera
    GROUP BY a.nombreAlumno
    ;
END $$
DELIMITER ;
