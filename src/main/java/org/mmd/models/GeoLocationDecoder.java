package org.mmd.models;


public class GeoLocationDecoder {

    private String name;

    private LocalNames local_names;

    private long lat;

    private  long lon;

    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalNames getLocal_names() {
        return local_names;
    }

    public void setLocal_names(LocalNames local_names) {
        this.local_names = local_names;
    }

    public long getLat() {
        return lat;
    }

    public void setLat(long lat) {
        this.lat = lat;
    }

    public long getLon() {
        return lon;
    }

    public void setLon(long lon) {
        this.lon = lon;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private  String state;

}
