package com.practica2.test;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.practica2.dao.AlumnoDao;
import com.practica2.entidades.Alumno;

public class Prueba {
	private static final Logger logger = LoggerFactory.getLogger( Prueba.class );
	public static void main(String[] args) {
		logger.debug( "Calling dao" );
		AlumnoDao dao = new AlumnoDao( );
		logger.debug( "SELECT * FROM" );
		List<Alumno> alumnos = dao.findAll( );
		for( Alumno alumno : alumnos ){
			logger.debug( "Alumno: {}", alumno.toString() );
		}
		logger.debug( "END" );
		System.exit( 0 );
	} 
}
