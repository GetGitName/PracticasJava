package org.practicas.patrones.dependencyinjection;

import java.util.List;

public class PersonaDAOImplDI implements IPersonaDAO {
	
	private IConexionDI conexion;
	

	@Override
	public void mostrarNombre() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setConexion(IConexionDI conexion) {
		// TODO Auto-generated method stub
		this.conexion = conexion;
	}

	@Override
	public void actualizar(PersonaDI t) {
		// TODO Auto-generated method stub
		System.out.println("Persona " + t.getNombres() + " actualizada");
	}

	@Override
	public void eliminar(int d) {
		// TODO Auto-generated method stub
		System.out.println("ID " + d + " eliminado");
	}

	@Override
	public PersonaDI leerPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonaDI> listarTodos() {
		// TODO Auto-generated method stub
		this.conexion.conectar();
		System.out.println("Listando...");
		return null;
	}

	@Override
	public void registrar(PersonaDI t) {
		// TODO Auto-generated method stub
		System.out.println("Persona " + t.getNombres() + " regiustrada");
	}

}
