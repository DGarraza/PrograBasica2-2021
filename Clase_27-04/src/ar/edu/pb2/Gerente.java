package ar.edu.pb2;
public class Gerente extends Empleado {

	private String cochera;
	
	
	public Gerente(String nombre, String apellido, Double salario, String fechaNacimiento, Gerente gerente,String cochera) {
		super(nombre, apellido, salario, fechaNacimiento, gerente);
		this.cochera = cochera;
	}

	
}
