package org.example;

public class TurnOnAirPlaneMode implements Task{
    private SmartPhone smartPhone;

    public TurnOnAirPlaneMode(SmartPhone smartPhone) {
        this.smartPhone = smartPhone;
    }

    public void run() {
        this.smartPhone.turnOnAirplaneMode();
    }

    public void cancel() {
        this.smartPhone.turnOffAirplaneMode();
    }
}
