package org.mmd.service;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.mmd.client.WeatherClient;
import org.mmd.models.GeoCoding;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.Json;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;

@Path("getWeather")
@ApplicationScoped
public class GetCurrentWeather {

    @ConfigProperty
    String key;

    @Inject
    GetGeoCoOrdinatesService getGeoCoOrdinatesService;

    @RestClient
    WeatherClient weatherClient;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object getGeoCoding(@QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("country") String country) {
        GeoCoding geoCoordinates = getGeoCoOrdinatesService.getGeoCoding(city,state,country);
        System.out.println("geoCoordinates"+geoCoordinates.getLatitude() + "  lat" + geoCoordinates.getLongitude() + "  lon");
        Object  value =  weatherClient.getCurrentWeather(geoCoordinates.getLatitude(),geoCoordinates.getLongitude(),key);
        System.out.println(value.toString());
        return value;
    }

}
