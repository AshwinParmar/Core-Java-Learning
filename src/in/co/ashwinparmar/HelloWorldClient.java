/**
 * 
 */
package in.co.ashwinparmar;

import java.lang.Exception;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * @author Accenture
 *
 */
public class HelloWorldClient {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("WS Client init...");
		URL url = new URL("http://localhost:7779/ws/hello?wsdl");
		
		// 1st Argument service URI, refer to WSDL document above.
		// 2nd Argument service name, refer to WSDL document above.
		QName qname = new QName("http://ashwinparmar.co.in/", "HelloWorldImplService");
		Service service = Service.create(url, qname);
		HelloWorld hello = service.getPort(HelloWorld.class);
		System.out.println(hello.getHelloWorldAsString("Ashwin Parmar"));
	}

}
