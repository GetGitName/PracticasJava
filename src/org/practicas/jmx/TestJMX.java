package org.practicas.jmx;

import java.net.MalformedURLException;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;



public class TestJMX {
	
	private JMXConnectorServer jmxConectorServer = null;

	public void levantaJMX() {
	      
		try {
			MBeanServer servidorMBeans = MBeanServerFactory.createMBeanServer();
			JMXServiceURL url = new JMXServiceURL(null, "localhost", 5555);
			//this.jmxConectorServer = JMXConnectorServerFactory.newJMXConnectorServer(url, null, servidorMBeans);
			this.jmxConectorServer.start();
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.err.println("Error: se ha producido un error al levantar el JMX");
			e.printStackTrace();
		}
	}
	
	
}
