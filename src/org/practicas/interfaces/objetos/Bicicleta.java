package org.practicas.interfaces.objetos;

import org.practicas.interfaces.Rueda;
import org.practicas.interfaces.Silla;

public class Bicicleta implements Rueda, Silla {

	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
		System.out.println("La bicicleta avanza");
	}

	@Override
	public void deteerse() {
		// TODO Auto-generated method stub
		System.out.println("La bicicleta se detiene");
	}

	@Override
	public void sentarse() {
		// TODO Auto-generated method stub
		System.out.println("Sentarse");
	}

}
