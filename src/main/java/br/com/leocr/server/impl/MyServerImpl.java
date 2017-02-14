package br.com.leocr.server.impl;

import br.com.leocr.server.MyServer;

import javax.ws.rs.Path;

@Path("/myserver")
public class MyServerImpl implements MyServer {

    public String getFirstName(String completeName) {
        return (completeName != null && completeName.contains(" ")) ?
                completeName.substring(0, completeName.indexOf(" ")) :
                completeName;
    }

    public Integer sum(Integer number1, Integer number2) {
        return number1 + number2;
    }
}
