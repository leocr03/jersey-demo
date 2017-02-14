package br.com.leocr.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
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
}
