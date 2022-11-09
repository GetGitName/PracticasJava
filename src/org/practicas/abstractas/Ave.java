/**
 * 
 */
package org.practicas.abstractas;

/**
 * @author MB91491
 *
 */
public class Ave extends Animal {

	/**
	 * 
	 */
	public Ave() {
		// TODO Auto-generated constructor stub
		super();
		setNombre("Ave");
	}

	/* (non-Javadoc)
	 * @see org.practicas.abstractas.Animal#moverse()
	 */
	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		System.out.println("El ave esta volando");
	}

}
