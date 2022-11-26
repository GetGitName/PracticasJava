package org.practicas.patrones.abstractfactory;

import org.practicas.patrones.factory.IConexion;

public class ConexionSQLServer implements IConexion {
	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	public ConexionSQLServer(){
		
		this.host = "loccalhost";
		this.puerto = "1433";
		this.usuario = "admin";
		this.contrasena = "123";
		
	}

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Se conect� a SQLServer");
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Se desconect� de SQLServer");
	}
}
