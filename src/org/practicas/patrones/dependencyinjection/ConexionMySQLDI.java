package org.practicas.patrones.dependencyinjection;

public class ConexionMySQLDI implements IConexionDI {
	
	private String usuario;
	private String clave;
	private String host;
	
	public ConexionMySQLDI(String usuario, String clave, String host){
		this.usuario = usuario;
		this.clave = clave;
		this.host = host;
	}

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Conectado a MySQL");
	}
}
