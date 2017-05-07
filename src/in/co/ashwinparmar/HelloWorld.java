/**
 * 
 */
package in.co.ashwinparmar;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author Accenture
 *
 */
// Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {
	@WebMethod String getHelloWorldAsString(String name);
}
