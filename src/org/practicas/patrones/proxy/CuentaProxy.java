package org.practicas.patrones.proxy;

import java.util.logging.Logger;

public class CuentaProxy implements ICuenta {
	
	private ICuenta cuentaReal;
	private final static Logger LOGGER = Logger.getLogger(CuentaProxy.class.getName());
	
	public CuentaProxy(ICuenta cuentaReal){
		this.cuentaReal = cuentaReal;
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		// TODO Auto-generated method stub
		LOGGER.info("--- Cuenta Proxy - Retirar dinero ---");
		if(cuentaReal == null){
			cuentaReal = new CuentaBancoAImpl();
			return cuentaReal.retirarDinero(cuenta, monto);
		} else {
			return cuentaReal.retirarDinero(cuenta, monto);
		}
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		// TODO Auto-generated method stub
		LOGGER.info("--- Cuenta Proxy - Mostrar saldo ---");
		if(cuentaReal == null){
			cuentaReal = new CuentaBancoAImpl();
			cuentaReal.mostrarSaldo(cuenta);
		} else {
			cuentaReal.mostrarSaldo(cuenta);
		}
	}

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		// TODO Auto-generated method stub
		LOGGER.info("--- Cuenta Proxy - Depositar dinero ---");
		if(cuentaReal == null){
			cuentaReal = new CuentaBancoAImpl();
			return cuentaReal.depositarDinero(cuenta, monto);
		} else {
			return cuentaReal.depositarDinero(cuenta, monto);
		}
	}

}
