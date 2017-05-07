/**
 * 
 */
package in.co.ashwinparmar;

import javax.jws.WebService;

/**
 * @author Accenture
 *
 */
// Service Implementation
@WebService(endpointInterface = "in.co.ashwinparmar.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	/* (non-Javadoc)
	 * @see in.co.ashwinparmar.HelloWorld#getHelloWorldAsString(java.lang.String)
	 */
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello " + name;
	}

}
