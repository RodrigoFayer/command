package org.example;

public class SmartPhone {
    private String airplaneMode = "off";

    public SmartPhone() {
    }

    public String getAirplaneMode() {
        return airplaneMode;
    }

    public void turnOnAirplaneMode() {
        this.airplaneMode = "on";
    }

    public void turnOffAirplaneMode() {
        this.airplaneMode = "off";
    }
}
