package org.practicas.patrones.decorator;

public abstract class CuentaDecorador implements ICuentaBancaria {
	
	protected ICuentaBancaria cuentaDecoradora;
	
	public CuentaDecorador(ICuentaBancaria cuentaDecorada){
		this.cuentaDecoradora = cuentaDecorada;
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		// TODO Auto-generated method stub
		this.cuentaDecoradora.abrirCuenta(c);
	}

}
