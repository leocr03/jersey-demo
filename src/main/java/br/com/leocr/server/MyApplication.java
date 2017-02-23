package br.com.leocr.server;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        register(JacksonJsonProvider.class);
        packages( "br.com.leocr.server");
        property(String.valueOf(SerializationFeature.WRAP_ROOT_VALUE), true);
        property(String.valueOf(DeserializationFeature.UNWRAP_ROOT_VALUE), true);
        property(org.glassfish.jersey.server.ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
    }
}
