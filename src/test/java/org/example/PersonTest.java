package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    Person person = new Person();
    SmartPhone smartPhone = new SmartPhone();

    @BeforeEach
    void setUp() {
        person = new Person();
        smartPhone = new SmartPhone();
    }

    @Test
    void shouldTurnOnAirplaneMode() {
        TurnOnAirPlaneMode turnOnAirPlaneMode = new TurnOnAirPlaneMode(smartPhone);
        person.runTask(turnOnAirPlaneMode);

        assertEquals("on", smartPhone.getAirplaneMode());
    }

    @Test
    void shouldTurnOffAirplaneMode() {
        TurnOffAirPlaneMode turnOffAirPlaneMode = new TurnOffAirPlaneMode(smartPhone);
        person.runTask(turnOffAirPlaneMode);

        assertEquals("off", smartPhone.getAirplaneMode());
    }

    @Test
    void shouldCancelLastRanTask() {
        TurnOnAirPlaneMode turnOnAirPlaneMode = new TurnOnAirPlaneMode(smartPhone);
        TurnOffAirPlaneMode turnOffAirPlaneMode = new TurnOffAirPlaneMode(smartPhone);

        person.runTask(turnOnAirPlaneMode);
        person.runTask(turnOffAirPlaneMode);

        person.cancelLastRanTask();

        assertEquals("on", smartPhone.getAirplaneMode());
    }
}