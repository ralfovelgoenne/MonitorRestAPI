package com.rov.mra;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import static org.junit.Assert.*;

public class HealthcheckResourceTest {

    private static String URI_LOCAL = "http://localhost:8080/rest/healthcheck";

    private static String PATH_CHECK = "check";

    private static String PATH_PING = "ping";
    @Test
    public void getPing() throws Exception {

        final Client client = ClientBuilder.newClient();
        WebTarget check = client.target(URI_LOCAL).path(PATH_PING);
        Invocation.Builder builder = check.request(MediaType.TEXT_PLAIN);
        String response = builder.get(String.class);
        System.out.println(response);
    }

    @Test
    public void getCheck() throws Exception {

        //final Client client = ClientBuilder.newClient();
        final Client client = ClientBuilder.newBuilder()
                .register(JacksonFeature.class)
                .build();

        WebTarget check = client.target(URI_LOCAL).path(PATH_CHECK);
        Invocation.Builder builder = check.request(MediaType.APPLICATION_JSON);
        HealthcheckDO response = builder.get(HealthcheckDO.class);
        System.out.println(response.toString());
    }

}