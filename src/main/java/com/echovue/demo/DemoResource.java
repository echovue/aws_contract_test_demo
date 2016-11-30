package com.echovue.demo;

import com.sun.jersey.spi.resource.Singleton;
import javax.ws.rs.core.Response;
import javax.ws.rs.Path;
import javax.ws.rs.POST;

import static javax.ws.rs.core.Response.Status.ACCEPTED;

@Singleton
@Path("/demo")
public class DemoResource {

    @POST
    public Response demo(final String request) {
        return Response.status(ACCEPTED).entity(null).build();
    }
}
