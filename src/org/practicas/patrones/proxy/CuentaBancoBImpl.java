package org.practicas.patrones.proxy;

public class CuentaBancoBImpl implements ICuenta {

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		// TODO Auto-generated method stub
		double saldoActual = cuenta.getSaldoInicial() + monto +0.2;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual: "+cuenta.getSaldoInicial());
		return cuenta;
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		// TODO Auto-generated method stub
		System.out.println("Saldo actual: "+cuenta.getSaldoInicial());
	}

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		// TODO Auto-generated method stub
		double saldoActual = cuenta.getSaldoInicial() - monto;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual: "+cuenta.getSaldoInicial());
		return cuenta;
	}

}
