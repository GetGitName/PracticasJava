package org.practicas.patrones.dependencyinjection;

public class ConexionPstgreDI implements IConexionDI {
	
	private String usuario;
	private String clave;
	private String host;
	
	public ConexionPstgreDI(String usuario, String clave, String host) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.host = host;
	}

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Conectado a PostgreSQL");
	}
	
	
	
	

}
