import javax.swing.text.html.parser.Entity;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/home")
public class prueba {
	
	@Path("/test")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response test(){
		String  respuesta="hellow kittie";
		return Response.status(200).entity(respuesta.toString()).build();
	}


}