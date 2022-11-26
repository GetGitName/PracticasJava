package org.practicas.patrones.strategy;

public class AntivirusAvanzado extends AnalisisAvanzado {

	@Override
	void analizarKeyLoggers() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Analizando en busca de Keyloggers...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	void analizarMemoria() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Analizando Memoria RAM...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	void analizarRootKits() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Analizando en busca de RootKits...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	void descomprimirZip() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Analizando archivos ZIP...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	void detener() {
		// TODO Auto-generated method stub
		System.out.println("Antivirus Avanzado - Análisis avanzado finalizado");
	}

	@Override
	void iniciar() {
		// TODO Auto-generated method stub
		System.out.println("Antivirus avanzado - Analisis avanzado iniciado");
	}

}
