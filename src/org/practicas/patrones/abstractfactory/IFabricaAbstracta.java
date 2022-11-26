package org.practicas.patrones.abstractfactory;

import org.practicas.patrones.factory.IConexion;

public interface IFabricaAbstracta {

	//IConexionBD getBD(String motor);
	IConexionRest getREST(String area);
	IConexion getBD(String motor);
	
}
