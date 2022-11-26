package org.practicas.patrones.factory;

public class ConexionOracle implements IConexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionOracle(){
		
		this.host = "loccalhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
		
	}

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Se conect� a Oracle");
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Se desconect� de Oracle");
	}

}
