package org.practicas.patrones.mvc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PersonaController implements Serializable {

	private List<PersonaMVC> lista;
	private PersonaService service;
	private String motor;
	
	public PersonaController(){
		motor = "MYSQL";
		lista = new ArrayList();
		service = new PersonaServiceImpl(new PersonaDAOMVCIMPL(motor));
		listar();
	}
	
	public void listar(){
		lista = service.listar();
	}
	
	public void seleccionar(String motor) {
		service = new PresonaServiceImpl(new PersonaDAOMVCIMPL(motor));
	}
	
	public List<PersonaMVC> getLista(){
		return lista;
	}
	
	public void setLista(List<PersonaMVC> lista) {
		this.lista = lista;
	}
	
}
