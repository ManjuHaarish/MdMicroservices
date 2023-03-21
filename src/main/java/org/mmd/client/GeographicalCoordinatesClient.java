package org.mmd.client;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


@RegisterRestClient
@Path("/direct")
public interface GeographicalCoordinatesClient {

    @GET
    public Object[] getLocation(@QueryParam("q")String q, @QueryParam("limit")int limit, @QueryParam("appid")String appid);
}
