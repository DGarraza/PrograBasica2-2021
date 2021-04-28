package ar.edu.pb2;

import static org.junit.Assert.*;

public class CajaFuerte {
	private Boolean estadoApertura;
	private Integer codigoApertura;
	
	public CajaFuerte(){
		estadoApertura = Boolean.TRUE;
	}
	
	public boolean estaAbierta() {
		return estadoApertura;
	}
	
public void cerrar(Integer codigoApertura) {
	estadoApertura = Boolean.FALSE;
	this.codigoApertura = codigoApertura;
}
	public void abrir(Integer codigoApertura) {
		if(this.codigoApertura==codigoApertura) {
			estadoApertura = Boolean.TRUE;
		}
	}
}
