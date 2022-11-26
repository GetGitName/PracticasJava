package org.practicas.patrones.dao;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImpl implements PersonaDAO {

	@Override
	public void mostrarNombre() {
		// TODO Auto-generated method stub
		System.out.println();
	}

	@Override
	public void actualizar(Persona t) {
		// TODO Auto-generated method stub
		System.out.println("Persona "+t.getNombres()+" actualizada.");
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		System.out.println("ID "+id+" eliminado.");
	}

	@Override
	public Persona leerPorId(int id) {
		// TODO Auto-generated method stub
		//logica
		return null;
	}

	@Override
	public List<Persona> listarTodos() {
		// TODO Auto-generated method stub
		List<Persona> lista = new ArrayList();
		Persona persona = new Persona();
		persona.setId(1);
		persona.setNombres("Dany");
		
		lista.add(persona);
		
		persona = new Persona();
		persona.setId(2);
		persona.setNombres("Valdez");
		
		lista.add(persona);
		
		return lista;
	}

	@Override
	public void registrar(Persona t) {
		// TODO Auto-generated method stub
		System.out.println("Persona "+t.getNombres()+" registrada.");
	}

}
