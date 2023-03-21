package org.mmd;

import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/getter")
public class WeatherToday {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getWeatherReport() {

        return "" ;
    }
}