package org.practicas.patrones.strategy;

public abstract class AnalisisAvanzado implements IEstrategia {

	@Override
	public void analizar() {
		// TODO Auto-generated method stub
		iniciar();
		analizarMemoria();
		analizarKeyLoggers();
		analizarRootKits();
		descomprimirZip();
		detener();
	}
	
	abstract void iniciar();
	abstract void analizarMemoria();
	abstract void analizarKeyLoggers();
	abstract void analizarRootKits();
	abstract void descomprimirZip();
	abstract void detener();
	

}
