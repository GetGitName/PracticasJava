package org.practicas.patrones.strategy;

public class AntivirusSimple extends AnalisisSimple {

	@Override
	void detener() {
		// TODO Auto-generated method stub
		System.out.println("Analisis Simple - Analisis simple finalizado");
	}

	@Override
	void iniciar() {
		// TODO Auto-generated method stub
		System.out.println("Analisis Simple - Analisis simple iniciado");
	}

	@Override
	void saltarZip() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Analizando...");
			Thread.sleep(2500);
			System.out.println("No se pudo analizar los archivos con extensión '.zip'");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
