package org.practicas.patrones.dependencyinjection;

public interface IPersonaDAO extends ICRUD<PersonaDI> {
	void mostrarNombre();
	void setConexion(IConexionDI conexion);
}
