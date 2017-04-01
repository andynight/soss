package servicios.get;
import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import interfaces.PATCH;

@Path("/home")
public class prueba {
	
	@Path("/test")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response test(){
		String  respuesta="hellow kittie";
		return Response.status(200).entity(respuesta.toString()).build();
	}
	
	@Path("/buses")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response crearBus(InputStream incomingData) {
		String  respuesta="hellow kittie";
		return Response.status(200).entity(respuesta.toString()).build();
	}
	
	@Path("/buses/{placaBus},{estado}")
	@PATCH
	@Produces("application/json")
	public Response modificarEstado(@PathParam("placaBus") String placaBus, @PathParam("estado") boolean estado) {
		String respuesta = "";
		return Response.status(200).entity(respuesta.toString()).build();
	}
	
	@Path("/buses/{placaBus}")
	@DELETE
	@Produces("application/json")
	public Response eliminarBuses(@PathParam("placaBus") String placaBus) {
		String respuesta = "";
		return Response.status(200).entity(respuesta.toString()).build();
	}
	
}