package org.mmd.helper;

import org.mmd.models.GeoCoding;

import javax.enterprise.context.ApplicationScoped;
import java.util.Map;

@ApplicationScoped
public class GeoLocationHelper {

    public GeoCoding getGeographicalLocDetails(Map value){
        System.out.println(value.values());
        GeoCoding geoCoding = new GeoCoding();
        geoCoding.setLatitude((Double) value.get("lat"));
        geoCoding.setLongitude((Double) value.get("lon"));
        System.out.println(geoCoding.getLatitude());
        return geoCoding;
    }
}
