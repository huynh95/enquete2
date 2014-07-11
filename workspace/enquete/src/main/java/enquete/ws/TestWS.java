/**
 * 
 */
package enquete.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author stagiaire
 *
 */

@Path("/helloworld")
public class TestWS {
	
	@GET
	@Path("/testget")
	@Produces(MediaType.TEXT_PLAIN)
	public String testGet(){
		return "le monde va bien il est beau et c'est la paix.";
	}

}
