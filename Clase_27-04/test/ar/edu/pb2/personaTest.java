package ar.edu.pb2;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class personaTest {


	@Test
	public void queSePuedaCrearUnaPersona() {
		Integer dni=222222;
		String nombre="ruben";
		
		Persona persona = new Persona (dni,nombre);
		assertNotNull(persona);
	}
}
