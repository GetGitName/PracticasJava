package org.practicas.patrones.abstractfactory;

public class ConexionRESTCompras implements IConexionRest {

	@Override
	public void leerURL(String url) {
		// TODO Auto-generated method stub
		System.out.println("Conectandose a "+ url);
	}
	
}
