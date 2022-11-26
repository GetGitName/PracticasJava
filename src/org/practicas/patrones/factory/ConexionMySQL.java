package org.practicas.patrones.factory;

public class ConexionMySQL implements IConexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionMySQL(){
		
		this.host = "loccalhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
		
	}

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Se conectó a MySQL");
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Se desconectó de MySQL");
	}

}
