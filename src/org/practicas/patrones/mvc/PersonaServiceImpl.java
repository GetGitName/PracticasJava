package org.practicas.patrones.mvc;

import java.util.List;

public class PersonaServiceImpl implements IPersonaService {
	
	private PersonaDAOMVC dao;
	
	public PersonaServiceImpl(PersonaDAOMVC dao){
		this.dao = dao;
	}

	@Override
	public List<PersonaMVC> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

}
