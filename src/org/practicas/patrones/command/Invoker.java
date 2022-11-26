package org.practicas.patrones.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	
	private List<IOperacion> operaciones = new ArrayList();
	
	public void recibirOperacion(IOperacion operacion){
		this.operaciones.add(operacion);
	}
	
	public void realizarOperaciones(){
		for (IOperacion op : operaciones) {
			op.execute();
		}
		this.operaciones.clear();
	}

}
