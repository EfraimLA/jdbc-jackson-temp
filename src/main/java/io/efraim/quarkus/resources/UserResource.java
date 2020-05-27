package io.efraim.quarkus.resources;

import io.efraim.quarkus.models.User;
import io.efraim.quarkus.services.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    UserService service;

    @GET
    public Response getAll() {
        return Response.ok(service.findAll()).build();
    }

    @POST
    public Response createOne(final User user) {
        service.persist(user);

        return Response.ok(user).build();
    }
}
