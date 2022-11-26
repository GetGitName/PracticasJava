package org.practicas.patrones.command;

public class DepositarImpl implements IOperacion {
	
	private Cuenta cuenta;
	private double monto;
	
	public DepositarImpl(Cuenta cuenta, double monto){
		this.cuenta = cuenta;
		this.monto = monto;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.cuenta.depositar(this.monto);
	}

}
