package org.practicas.patrones.decorator;

public class CuentaAhorro implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta c) {
		// TODO Auto-generated method stub
		System.out.println("-----------");
		System.out.println("Se abrió una cuenta de Ahorros");
		System.out.println("Cliente: "+c.getCliente());
	}
	
}
