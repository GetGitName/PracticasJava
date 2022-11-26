package org.practicas.patrones.factory;

public class ConexionFabrica {
	
	public IConexion getConexion(String motor){
		
		if(motor == null){
			return new ConexionVacia();
		}
		if(motor.equalsIgnoreCase("MYSQL")){
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")){
			return new ConexionOracle();
		}else if (motor.equalsIgnoreCase("POSTGRESQL")){
			return new ConexionPostgreSQL();
		} else if(motor.equalsIgnoreCase("SQL")){
			return new ConexionSQLServer();
		}
		
		return new ConexionVacia();
	}

}
