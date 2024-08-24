package org.example;

public class TurnOffAirPlaneMode implements Task{
    private SmartPhone smartPhone;

    public TurnOffAirPlaneMode(SmartPhone smartPhone) {
        this.smartPhone = smartPhone;
    }

    public void run() {
        this.smartPhone.turnOffAirplaneMode();
    }

    public void cancel() {
        this.smartPhone.turnOnAirplaneMode();
    }
}
