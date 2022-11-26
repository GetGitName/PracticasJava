package org.practicas.patrones.strategy;

public abstract class AnalisisSimple implements IEstrategia {

	@Override
	public void analizar() {
		// TODO Auto-generated method stub
		iniciar();
		saltarZip();
		detener();
	}
	
	abstract void iniciar();
	abstract void saltarZip();
	abstract void detener();

}
