package org.practicas.patrones.abstractfactory;

import org.practicas.patrones.factory.IConexion;

public class ConexionRESTFabrica implements IFabricaAbstracta {

	@Override
	public IConexion getBD(String motor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IConexionRest getREST(String area) {
		// TODO Auto-generated method stub
		if(area == null){
			return new ConexionRESTNoArea();
		}
		
		if(area.equalsIgnoreCase("compras")) {
			return new ConexionRESTCompras();
		} else if(area.equalsIgnoreCase("ventas")){
			return new ConexionRESTVentas();
		}
		
		return new ConexionRESTNoArea();
	}

}
