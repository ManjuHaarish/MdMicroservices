package org.mmd.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
@RegisterRestClient
public interface TestClient {


    @GET
    public Object getIp();
}
