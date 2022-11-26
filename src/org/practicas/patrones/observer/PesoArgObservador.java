package org.practicas.patrones.observer;

public class PesoArgObservador extends Observador {

	private double valorCambio = 29.86;
	
	public PesoArgObservador(Subject sujeto){
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		System.out.println("ARG: " + (sujeto.getEstado() * valorCambio));
	}

}
