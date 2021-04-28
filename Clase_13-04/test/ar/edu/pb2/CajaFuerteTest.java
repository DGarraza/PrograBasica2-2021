package ar.edu.pb2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CajaFuerteTest {

	private CajaFuerte caja;
	

	@Test
	public void alCrearUnaCajaFuerteEstaAbierta() {

		// preparacion (dado...)

		// ejecucion (cuando...)
		whenCreoUnaCajaFuerte();

		// validación - contrastacion (entonces...)
		thenLaCajaFuerteEstaAbierta();

	}

	public void thenLaCajaFuerteEstaAbierta() {
		Assert.assertTrue(caja.estaAbierta() == true);
	}

	private void whenCreoUnaCajaFuerte() {
		caja = new CajaFuerte();
	}

	@Test
	public void alCerrarDeberiaEstarCerrada() {
		CajaFuerte caja = givenExiteUnaCajaFuerte();
		
		whenCierroLaCajaFuerte(caja);
		
		thenLaCajaFuerteEstaCerrada(caja);
	}

 private void thenLaCajaFuerteEstaCerrada(CajaFuerte caja) {
		// TODO Auto-generated method stub
	Assert.assertTrue(caja.estaAbierta()==false);
	
}
private void whenCierroLaCajaFuerte(CajaFuerte caja) {
	caja.cerrar(null);
	
}
private CajaFuerte givenExiteUnaCajaFuerte() {
	return caja = new CajaFuerte();
}

@Test
public void alAbirLaCajaFuerteConElCodigoDeCierreDeberiaEstarAbierta() {
	//CajaFuerte caja = givenExiteUnaCajaFuerte();
	CajaFuerte caja = new CajaFuerte();
	
	Integer codigoApertura =123;
	//givenCierroLaCajaFuerte(caja; codigoApertura);
	caja.cerrar(codigoApertura);
	
	//whenAbroLaCajaFuerteConCodigo(codigoApertura); (ejecucion)
	
	caja.abrir(codigoApertura);
	
	//thenLaCajaFuerteEstaAbierta(caja);
	Assert.assertTrue(caja.estaAbierta());
	
}

	}






