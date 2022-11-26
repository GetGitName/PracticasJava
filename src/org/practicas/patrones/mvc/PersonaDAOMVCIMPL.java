package org.practicas.patrones.mvc;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOMVCIMPL implements PersonaDAOMVC {
	
	private ConexionMVC conexion;
	private String motor;
	
	public PersonaDAOMVCIMPL(String motor){
		this.motor = motor;
		
		if(motor.equals("MYSQL")){
			conexion = new MySQLMVC();
		} else if(motor.equals("POSGRESQL")){
			conexion = new PostgreSQL();
		}
	}

	@Override
	public List<PersonaMVC> listar() {
		// TODO Auto-generated method stub
		List<PersonaMVC> lista = new ArrayList();
		
		if (motor.equals("MYSQL")) {
			PersonaMVC per = new PersonaMVC();
			per.setId(1);
			per.setNombres("Host MYSQL");
			per.setEdad(27);
			lista.add(per);

			per = new PersonaMVC();
			per.setId(2);
			per.setNombres("Dany");
			per.setEdad(27);
			lista.add(per);

		} else if (motor.equals("POSTGRESQL")) {
			PersonaMVC per = new PersonaMVC();
			per.setId(1);
			per.setNombres("Dany POSTGRESQL");
			per.setEdad(27);
			lista.add(per);

			per = new PersonaMVC();
			per.setId(2);
			per.setNombres("DVR");
			per.setEdad(27);
			lista.add(per);
		
		}
		return lista;

	}
}
