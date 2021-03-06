package ar.edu.pb2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class EmpleadoTest {

	@Test
	public void queSePuedaCrearUnEmpleado() {
		
		String nombre = "El Mulo";
		String apellido = "Martinez";
		Double salario = 1000.0;
		String fechaNacimiento = "21/2/1990";
		Gerente gerentePrincipal = new Gerente("El capo", "garcia", 20000.0,"22/10/1990",null,"cochera1");
		Gerente subgerente = new Gerente("el segundo", "perez", 10000.0,"22/10/1990",gerentePrincipal,"cochera1");		
		Empleado empleado = new Empleado(nombre,apellido,salario,fechaNacimiento, subgerente);
		
		assertNotNull(empleado);
		
		Ingeniero ingeniero = new Ingeniero("El capo", "garcia", 20000.0,"22/10/1990",gerentePrincipal,100.0);
	
		assertEquals(ingeniero.obtenerSalario(),20100.0,0.1);
	}
	
	
	
}
