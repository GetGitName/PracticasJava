package org.practicas.patrones.singleton;

import java.util.ArrayList;
import java.util.List;

public class PaisDAOImpl {
	
	public static PaisDAOImpl instancia = null;
	
	private PaisDAOImpl(){}
	
	public static PaisDAOImpl getInstance(){
		if(instancia == null){
			instancia = new PaisDAOImpl();
		}
		return instancia;
	}
	
	private List paises = null;
	
	public List getPaises(){
		if(paises == null){
			paises = new ArrayList();
			Pais p = new Pais("Peru");
			Pais p2 = new Pais("Mexico");
			Pais p3 = new Pais("Colombia");
			
			paises.add(p);
			paises.add(p2);
			paises.add(p3);
		}
		
		
		return paises;
	}
	

}
