package org.practicas.interfaces.objetos;

import org.practicas.interfaces.Rueda;

public class Carro implements Rueda {

	public Carro(){}

	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
		System.out.println("El carro avanza");
	}

	@Override
	public void deteerse() {
		// TODO Auto-generated method stub
		System.out.println("El carro se detiene");
	}
	
}
