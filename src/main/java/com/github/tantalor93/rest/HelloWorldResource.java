package com.github.tantalor93.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.tantalor93.dto.Body;
import com.github.tantalor93.dto.Result;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    @GET
    @Path("/ping")
    public String ping() {
        return "OK";
    }

    @POST
    @Path("/perf-test")
    public Result sayHello(Body body) {
        return new Result(body.getMsg());
    }
}
