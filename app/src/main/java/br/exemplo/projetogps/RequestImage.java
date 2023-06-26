package br.exemplo.projetogps;

public class RequestImage {

    private Double longitude;

    private Double latitude;

    private String imageBase64;

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public String getImageBase64() {
        return imageBase64;
    }
}
