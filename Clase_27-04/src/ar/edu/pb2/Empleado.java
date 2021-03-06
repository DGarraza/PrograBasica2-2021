package ar.edu.pb2;
public class Empleado {
	
	protected String nombre;
	protected String apellido;
	protected Double salario;
	protected String fechaNacimiento;
	protected Gerente gerente;

	public Empleado(String nombre, String apellido, Double salario, String fechaNacimiento, Gerente gerente  ) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
		this.gerente = gerente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Double obtenerSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}
