package com.rov.mra;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/healthcheck")
public class HealthcheckResource {

    @GET
    @Path("ping")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPing() {

        return "ping";
    }

    @GET
    @Path("check")
    @Produces(MediaType.APPLICATION_JSON)
    public HealthcheckDO getCheck() {

        boolean systemfunction = true;
        //HashMap<String,String> map = new HashMap<>();
        //map.put("bcwc", "OK");
        String interfacename = "testinterface";
        HealthcheckDO hcdo = new HealthcheckDO(systemfunction, interfacename);
        return hcdo;
    }
}
