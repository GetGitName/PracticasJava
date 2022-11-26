package org.practicas.patrones.command;

public class Cuenta {
	
	private int id;
	private double saldo;
	
	public Cuenta(int id, double saldo){
		this.id = id;
		this.saldo = saldo;
	}
	
	public void retirar(double monto){
		this.saldo = this.saldo - monto;
		System.out.println("[COMANDO RETIRAR] "+id+" saldo: "+this.saldo);
	}
	
	public void depositar(double monto){
		this.saldo = this.saldo + monto;
		System.out.println("[COMANDO DEPOSITAR] "+id+" Saldo: "+this.saldo);
	}

}
