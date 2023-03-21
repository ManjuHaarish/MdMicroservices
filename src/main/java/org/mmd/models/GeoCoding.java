package org.mmd.models;


public class GeoCoding {
    public GeoCoding(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "GeoCoding{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    public GeoCoding(){}

    private Double latitude;

    private Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
