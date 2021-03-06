package edu.drake.research.lipswithmaps;

/**
 * Created by Mahesh Gaya on 3/22/17.
 */

public class LocationLngLat {
    public static final String TABLE_NAME = "location";
    public static final String LONGITUDE = "longitude";
    public static final String LATITUDE = "latitude";
    public static final String ACCURACY = "accuracy";

    private double longitude;
    private double latitude;
    private double accuracy;

    public LocationLngLat(){
        this.longitude = this.latitude = this.accuracy = 0;
    }

    public LocationLngLat(double longitude, double latitude, double accuracy){
        this.longitude = longitude;
        this.latitude = latitude;
        this.accuracy = accuracy;
    }

    @Override
    public String toString(){
        return latitude + " :: " + longitude + " :: " + accuracy;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

}
