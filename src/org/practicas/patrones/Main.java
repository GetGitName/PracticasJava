package org.practicas.patrones;

import org.practicas.abstractas.Ave;
import org.practicas.abstractas.Perro;
import org.practicas.interfaces.objetos.Bicicleta;
import org.practicas.interfaces.objetos.Carro;
import org.practicas.jmx.TestJMX;
import org.practicas.patrones.singleton.Logger;

public class Main {
	
	public static void main(String[] args) {
		
		//Objeto principal
		Main m = new Main();
		
		//Singleton
		m.mLogger();
		
		//Interfaces
		m.interfaces();
		
		//Clases Abstractas
		m.clasesAbstractas();
		
		//JMX
		//m.mJMX();
		
		
		
	}
	
	public void mLogger(){
		
		Logger logger_1 = Logger.getInstance();
		Logger logger_2 = Logger.getInstance();
		
		logger_1.setValue("Hola Mundo");
		System.out.println(logger_2.getValue());
	}
	
	public void mJMX(){
		TestJMX jmx = new TestJMX();
		jmx.levantaJMX();
	}
	
	public void interfaces(){
		Carro c = new Carro();
		Bicicleta b = new Bicicleta();
		
		c.avanzar();
		b.avanzar();
		b.sentarse();
	}
	
	public void clasesAbstractas(){
		Perro p = new Perro();
		p.moverse();
		p.comer();
		
		Ave a = new Ave();
		a.moverse();
		a.comer();
	}
	
}
