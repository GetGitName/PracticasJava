package org.practicas.patrones.decorator;

public class BlindajeDecorador extends CuentaDecorador {

	public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		// TODO Auto-generated method stub
		super.abrirCuenta(c);
		agregarBlindaje(c);
	}
	
	public void agregarBlindaje(Cuenta  c){
		System.out.println("Se agregó blindaje a la cuenta del cliente "+c.getCliente());
	}
}
