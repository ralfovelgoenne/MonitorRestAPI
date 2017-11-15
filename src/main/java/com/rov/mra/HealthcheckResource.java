package com.rov.mra;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/healthcheck")
public class HealthcheckResource {

    @GET
    //@Path("info")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHealthcheckInfo() {
        return "test";
    }


}
