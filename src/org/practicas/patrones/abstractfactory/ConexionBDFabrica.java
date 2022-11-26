package org.practicas.patrones.abstractfactory;

import org.practicas.patrones.factory.ConexionMySQL;
import org.practicas.patrones.factory.ConexionOracle;
import org.practicas.patrones.factory.ConexionPostgreSQL;
import org.practicas.patrones.factory.ConexionVacia;
import org.practicas.patrones.factory.IConexion;

public class ConexionBDFabrica implements IFabricaAbstracta {

	@Override
	public IConexion getBD(String motor) {
		// TODO Auto-generated method stub
		
		if(motor == null){
			return  new ConexionVacia();
		}
		if(motor.equalsIgnoreCase("mysql")){
			return  new ConexionMySQL();
		} else if(motor.equalsIgnoreCase("mysql")){
			return  new ConexionOracle();
		} else if (motor.equalsIgnoreCase("mysql")) {
			return  new ConexionPostgreSQL();
		} else if(motor.equalsIgnoreCase("mysql")) {
			return  new ConexionSQLServer();
		}
		return  new ConexionVacia();

	}

	@Override
	public IConexionRest getREST(String area) {
		// TODO Auto-generated method stub
		return null;
	}

}
