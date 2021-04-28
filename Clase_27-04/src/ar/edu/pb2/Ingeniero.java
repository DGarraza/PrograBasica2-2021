package ar.edu.pb2;
public class Ingeniero extends Empleado {

	private Double plus;
	
	
	public Ingeniero(String nombre, String apellido, Double salario, String fechaNacimiento, Gerente gerente,Double plus) {
		super(nombre, apellido, salario, fechaNacimiento, gerente);
		this.plus = plus;
	}

	@Override
	public Double obtenerSalario() {
		return this.salario+this.plus;
	}
	
}
