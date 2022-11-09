package org.practicas.patrones.singleton;

public class Logger {
	
	private static Logger log;
	private String value;

	private Logger(){}
	
	public static synchronized Logger getInstance(){
		if(log == null){
			log = new Logger();
		}
		return log;
	}
	
	public void log(String msg){
		System.out.println(msg);
	}
	
	public void setValue(String msg){
		this.value = msg;
	}
	
	public String getValue(){
		return this.value;
	}
	
}
