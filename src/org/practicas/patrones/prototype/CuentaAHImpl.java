package org.practicas.patrones.prototype;

public class CuentaAHImpl implements ICuenta {
	
	private String tipo;
	private double monto;

	public CuentaAHImpl(){
		tipo = "AHORRO";
	}

	@Override
	public ICuenta clonar() {
		// TODO Auto-generated method stub
		CuentaAHImpl cuenta = null;
		
		try {
			cuenta = (CuentaAHImpl) clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cuenta;
	}
	
	@Override
	public String toString(){
		return "CuentaAHImpl [tipo = "+tipo+", monto = "+monto+"]";
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	

}
