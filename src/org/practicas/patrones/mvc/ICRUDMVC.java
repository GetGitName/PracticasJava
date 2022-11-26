package org.practicas.patrones.mvc;

import java.util.List;

public interface ICRUDMVC<T> {
	
	List<T> listar();

}
