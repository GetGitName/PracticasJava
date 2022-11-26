package org.practicas.patrones.factory;

public class ConexionVacia implements IConexion {

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.err.println("NO SE ESPECIFIC� PROVEEDOR PARA CONECTAR");
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.err.println("NO SE ESPECIFIC� PROVEEDOR PARA DESCONECTAR");
	}

}
