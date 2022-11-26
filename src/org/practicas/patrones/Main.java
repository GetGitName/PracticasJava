package org.practicas.patrones;

import java.util.List;

import org.practicas.abstractas.Ave;
import org.practicas.abstractas.Perro;
import org.practicas.interfaces.objetos.Bicicleta;
import org.practicas.interfaces.objetos.Carro;
import org.practicas.jmx.TestJMX;
import org.practicas.patrones.abstractfactory.FabricaProductor;
import org.practicas.patrones.abstractfactory.IConexionRest;
import org.practicas.patrones.abstractfactory.IFabricaAbstracta;
import org.practicas.patrones.command.DepositarImpl;
import org.practicas.patrones.command.Invoker;
import org.practicas.patrones.command.RetirarImpl;
import org.practicas.patrones.dao.CRUD;
import org.practicas.patrones.dao.Persona;
import org.practicas.patrones.dao.PersonaDAOImpl;
import org.practicas.patrones.decorator.BlindajeDecorador;
import org.practicas.patrones.decorator.Cuenta;
import org.practicas.patrones.decorator.CuentaAhorro;
import org.practicas.patrones.decorator.ICuentaBancaria;
import org.practicas.patrones.dependencyinjection.ConexionMySQLDI;
import org.practicas.patrones.dependencyinjection.ConexionPstgreDI;
import org.practicas.patrones.dependencyinjection.IConexionDI;
import org.practicas.patrones.dependencyinjection.IPersonaDAO;
import org.practicas.patrones.dependencyinjection.PersonaDAOImplDI;
import org.practicas.patrones.facade.CheckFacade;
import org.practicas.patrones.factory.ConexionFabrica;
import org.practicas.patrones.factory.IConexion;
import org.practicas.patrones.memento.Caretaker;
import org.practicas.patrones.memento.Juego;
import org.practicas.patrones.memento.Originator;
import org.practicas.patrones.observer.PesoArgObservador;
import org.practicas.patrones.observer.PesoMXObservador;
import org.practicas.patrones.observer.SolObservador;
import org.practicas.patrones.observer.Subject;
import org.practicas.patrones.prototype.CuentaAHImpl;
import org.practicas.patrones.proxy.CuentaBancoBImpl;
import org.practicas.patrones.proxy.CuentaProxy;
import org.practicas.patrones.proxy.ICuenta;
import org.practicas.patrones.singleton.Conexion;
import org.practicas.patrones.singleton.Logger;
import org.practicas.patrones.singleton.Pais;
import org.practicas.patrones.singleton.PaisDAOImpl;
import org.practicas.patrones.strategy.AntivirusAvanzado;
import org.practicas.patrones.strategy.Contexto;

public class Main {
	
	public static void main(String[] args) {
		
		//Objeto principal
		Main m = new Main();
		
		System.out.println("####################################");
		System.out.println("# Patrones de diseño               #");
		System.out.println("####################################");
		
		
		//Singleton
		System.out.println("################# Singleton ###################");
		m.mLogger();
		m.conexion();
		m.mPaises();
		
		//Factory
		System.out.println("################# Factory ###################");
		m.mFactory();
		
		//Factory abstract
		System.out.println("################# Factory Abstract ###################");
		m.mFactoryAbstrac();
		
		//Prototype
		System.out.println("################# Prototype ###################");
		m.mPrototype();
		
		//Facade
		System.out.println("################# Facade ###################");
		m.mFacade();
		
		//Decorator
		System.out.println("################# Decorator ###################");
		m.mDecorator();
		
		//Proxy
		System.out.println("################# Proxy ###################");
		m.mProxy();
		
		//Commands
		System.out.println("################# Commands ###################");
		m.mCommnads();
		
		//Memento
		System.out.println("################# Memento ###################");
		m.mMemento();
		
		//Observer
		System.out.println("################# Observer ###################");
		m.mObserver();
		
		//Strategy
		System.out.println("################# Observer ###################");
		m.mStrategy();
		
		//DAO
		System.out.println("################# DAO ###################");
		m.mDAO();
		
		//Dependnecy Injection
		System.out.println("################# Dependency injection ###################");
		m.mDependencyInjection();
		
		//Interfaces
		System.out.println("####################################");
		System.out.println("# Interfaces                       #");
		System.out.println("####################################");
		m.interfaces();
		
		//Clases Abstractas
		System.out.println("####################################");
		System.out.println("# Clases abstractas                #");
		System.out.println("####################################");
		m.clasesAbstractas();
		
		//JMX
		//m.mJMX();
		
		
		
	}
	
	public void mDependencyInjection(){
		IConexionDI cx = new ConexionMySQLDI("root", "741", "localhost");
		
		IConexionDI cx2 = new ConexionPstgreDI("admin", "123", "localhost");
		
		IPersonaDAO dao = new PersonaDAOImplDI();
		dao.setConexion(cx);
		
		dao.listarTodos();
	}
	
	public void mDAO(){
		CRUD<Persona> dao = new PersonaDAOImpl();
		for (Persona per : dao.listarTodos()) {
			System.out.println(per.getNombres());
		}
		
		Persona per = new Persona();
		per.setNombres("DanyV");
		dao.registrar(per);
	}
	
	public void mStrategy(){
		Contexto contexto = new Contexto(new AntivirusAvanzado());
		contexto.ejecutar();
	}
	
	public void mObserver(){
		Subject subject = new Subject();
		
		new SolObservador(subject);
		new PesoArgObservador(subject);
		new PesoMXObservador(subject);
		
		System.out.println("Si desewa cambiar 10 dólares obtendá: ");
		subject.setEstado(10);
		System.out.println("---------------------");
		System.out.println("Si desewa cambiar 100 dólares obtendá: ");
		subject.setEstado(100);
	}
	
	public void mMemento(){
		String nombreJuego = "Crash Bandicoot";
		
		Juego juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(1);
		
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
		
		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(2);
		originator.setEstado(juego);
		
		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(3);
		originator.setEstado(juego);
		
		caretaker.addMemento(originator.guardar());
		
		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(4);
		originator.setEstado(juego);
		
		caretaker.addMemento(originator.guardar());
		
		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(5);
		originator.setEstado(juego);
		
		caretaker.addMemento(originator.guardar());
		
		originator.setEstado(juego);
		originator.restaurar(caretaker.getMemento(0));
		
		juego = originator.getEstado();
		System.out.println(juego);
	}
	
	public void mCommnads(){
		org.practicas.patrones.command.Cuenta cuenta = new org.practicas.patrones.command.Cuenta(1, 200);
		
		DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
		RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);
		
		Invoker ivk = new Invoker();
		ivk.recibirOperacion(opDepositar);
		ivk.recibirOperacion(opRetirar);
		
		ivk.realizarOperaciones();
	}
	
	public void mProxy(){
		org.practicas.patrones.proxy.Cuenta c = new org.practicas.patrones.proxy.Cuenta(1, "Daniel", 100);
		
		ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 50);
		c = cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);
	}
	
	public void mDecorator(){
		Cuenta c = new Cuenta(1,"Daniel");
		
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
		
		//cuenta.abrirCuenta(c);
		cuentaBlindada.abrirCuenta(c);
	}
	
	public void mFacade(){
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("02/07/2018", "08/07/2018", "CDMX", "Cancun");
		
		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("02/07/2018", "08/07/2018", "Lima", "España");
	}
	
	public void mLogger(){
		
		Logger logger_1 = Logger.getInstance();
		Logger logger_2 = Logger.getInstance();
		
		logger_1.setValue("Hola Mundo");
		System.out.println(logger_2.getValue());
	}
	
	public void mJMX(){
		TestJMX jmx = new TestJMX();
		jmx.levantaJMX();
	}
	
	public void interfaces(){
		Carro c = new Carro();
		Bicicleta b = new Bicicleta();
		
		c.avanzar();
		b.avanzar();
		b.sentarse();
	}
	
	public void clasesAbstractas(){
		Perro p = new Perro();
		p.moverse();
		p.comer();
		
		Ave a = new Ave();
		a.moverse();
		a.comer();
	}
	
	public void conexion(){
		Conexion c = Conexion.getInstancia();
		c.conectar();
		c.desconectar();
	}
	
	public void mPaises(){
		PaisDAOImpl dao = PaisDAOImpl.getInstance();
		for(Object obj:dao.getPaises()){
			System.out.println(((Pais)obj).getNombre());
		}
		
		System.out.println("**************");
		
		for(Object obj:dao.getPaises()){
			System.out.println(((Pais)obj).getNombre());
		}
	}
	
	public void mFactory(){
		
		ConexionFabrica fabrica = new ConexionFabrica();
		
		IConexion cxMySQL = fabrica.getConexion("mysql");
		cxMySQL.conectar();
		cxMySQL.desconectar();
		
		IConexion cxOracle = fabrica.getConexion("oracle");
		cxOracle.conectar();
		cxOracle.desconectar();
		
		IConexion cxH2 = fabrica.getConexion("h2");
		cxH2.conectar();
		cxH2.desconectar();
		
	}
	
	public void mFactoryAbstrac(){
		IFabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
		IConexion cxBD1 = fabricaBD.getBD("Mysql");
		
		cxBD1.conectar();

		IFabricaAbstracta fabricaREST = FabricaProductor.getFactory("rest");
		IConexionRest cxRS1 = fabricaREST.getREST("comPRas");
		
		cxRS1.leerURL("https://www.youtube.com/subscription_center?add_user=mitocode");
		
	}
	
	public void mPrototype(){
		CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
		cuentaAhorro.setMonto(200);
		
		CuentaAHImpl cuentaAhorro2 = new CuentaAHImpl();
		
		CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.clonar();
		
		System.out.println(cuentaAhorro);
		System.out.println(cuentaAhorro2);
		System.out.println(cuentaClonada);
	}
	
}
