package org.practicas.abstractas;

public abstract class Animal {
	
	private String nombre;

	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public void comer(){
		System.out.println("El "+ this.nombre + " esta comiento.");
	}
	
	public abstract void moverse();
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}

}
