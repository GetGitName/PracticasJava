package org.practicas.patrones.dependencyinjection;

import java.util.List;

public interface ICRUD<T> {

	List<T> listarTodos();
	T leerPorId(int id);
	void registrar(T t);
	void actualizar(T t);
	void eliminar(int d);
	
}
