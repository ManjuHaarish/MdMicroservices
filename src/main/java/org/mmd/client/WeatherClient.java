package org.mmd.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@RegisterRestClient
@Path("/weather")
public interface WeatherClient {

    @GET
    public Object getCurrentWeather(@QueryParam("lat")double lat ,@QueryParam("lon")double lon,@QueryParam("appid") String appid);


}

