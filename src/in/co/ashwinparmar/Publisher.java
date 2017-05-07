/**
 * 
 */
package in.co.ashwinparmar;

import javax.xml.ws.Endpoint;

/**
 * @author Accenture
 *
 */
//Endpoint publisher
public class Publisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7779/ws/hello", new HelloWorldImpl());
		System.out.println("Web service run at: http://localhost:7779/ws/hello?wsdl" );
	}
}
