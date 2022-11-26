package org.practicas.patrones.factory;

public class ConexionPostgreSQL implements IConexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionPostgreSQL(){
		
		this.host = "loccalhost";
		this.puerto = "5433";
		this.usuario = "postgres";
		this.contrasena = "123";
		
	}

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Se conectó a PostgreSQL");
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Se desconectó de PostgreSQL");
	}

}
