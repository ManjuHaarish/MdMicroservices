package org.mmd.service;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.mmd.client.GeographicalCoordinatesClient;
import org.mmd.client.TestClient;
import org.mmd.helper.GeoLocationHelper;
import org.mmd.models.GeoCoding;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.HashMap;

@Path("geoPosition")
@ApplicationScoped
public class GetGeoCoOrdinatesService {

    @ConfigProperty
    String key;

    static final int limit = 2 ;

    static  final String comma =",";

    static  final String ampersand ="&";

    @Inject
    GeoLocationHelper helper;

    @RestClient
    GeographicalCoordinatesClient location;

    @RestClient
    TestClient testClient;

    @GET
    @Path("/get")
    public String hello(){
        return "hell";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public GeoCoding getGeoCoding(@QueryParam("city") String city, @QueryParam("state")String state, @QueryParam("country")String country){
        StringBuilder query = getQueryParam(city, state, country);
        System.out.println(query.toString());
        Object[] value = location.getLocation(query.toString(),limit,key);
        System.out.println(value.length);
        System.out.println(Arrays.stream(value).toList());
        HashMap<String,Object> map= (HashMap<String, Object>) Arrays.stream(value).toList().get(0);
        return helper.getGeographicalLocDetails(map);
    }

    private StringBuilder getQueryParam(String city, String state, String country) {
        StringBuilder query = new StringBuilder();
        query.append(city);
        query.append(comma);
        query.append(state);
        query.append(comma);
        query.append(country);
        return query;
    }

    @GET
    @Path("/test")
    public Object getloc(){
        return testClient.getIp();
    }


}
