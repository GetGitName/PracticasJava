package org.practicas.patrones.decorator;

public class CuentaCorriente implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta c) {
		// TODO Auto-generated method stub
		System.out.println("-----------");
		System.out.println("Se abri� una cuenta Corriente");
		System.out.println("Cliente: "+c.getCliente());
	}
	
}
