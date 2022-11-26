package org.practicas.patrones.abstractfactory;

public class FabricaProductor {
	
	public static IFabricaAbstracta getFactory(String tipFabrica){
		
		if(tipFabrica.equalsIgnoreCase("bd")){
			return new ConexionBDFabrica();
		} else if(tipFabrica.equalsIgnoreCase("rest")){
			return new ConexionRESTFabrica();
		}
		
		return null;
		
	}

}
