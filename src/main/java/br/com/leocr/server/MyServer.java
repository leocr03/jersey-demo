package br.com.leocr.server;

import br.com.leocr.server.request.NumberRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

public interface MyServer {
    @GET
    @Path("/firstname/{completeName}")
    @Produces(MediaType.TEXT_PLAIN)
    String getFirstName(@PathParam("completeName") String completeName);

    @GET
    @Path("/sum/{number1}/{number2}")
    @Produces(MediaType.TEXT_PLAIN)
    Integer sum(@PathParam("number1") Integer number1, @PathParam("number2") Integer number2);

    @POST
    @Path("/sumtriple")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Integer sumTriple(NumberRequest number);
}
