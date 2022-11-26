package org.practicas.patrones.singleton;

public class Conexion {
	
	//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
	//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
	
	//Declaracion
	private static Conexion instancia;
	
	//Evitamos crear instancias adicionales
	private Conexion(){}
	
	//Obtener inscatncia unicamente por este metodo.
	public static Conexion getInstancia(){
		if(instancia == null){
			instancia = new Conexion();
		}
		return instancia;
	}
	
	//Método prueba
	public void conectar(){
		System.out.println("Me conecte a la BD");
	}
	
	//Metodo de prueba
	public void desconectar(){
		System.out.println("Me desconecte de la bD");
	}

}
