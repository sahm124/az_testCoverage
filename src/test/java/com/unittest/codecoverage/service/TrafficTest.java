package com.unittest.codecoverage.service;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import com.unittest.codecoverage.models.Traffic;

import com.unittest.codecoverage.models.StreetDirectionFlow;
import com.unittest.codecoverage.models.TrafficLigth;


public class TrafficTest {

    @Test
    public void testGetCurrentTrafficLight() {
        Traffic traffic = new Traffic();
        traffic.setCurrentTrafficLight(TrafficLigth.GREEN);
        assertEquals(TrafficLigth.GREEN, traffic.getCurrentTrafficLight());
    }




    @Test
    public void testIntenseCarTraffic() {
        Traffic traffic = new Traffic();
        traffic.setIntenseCarTraffic(true);
        assertTrue(traffic.intenseCarTraffic());
    }


    @Test
    public void testMaxSpeedAllowed() {
        Traffic traffic = new Traffic();
        traffic.setMaxSpeedAllowed((short) 80);
        assertEquals(80, traffic.getMaxSpeedAllowed());
    }

    @Test
    public void testMinSpeedAllowed() {
        Traffic traffic = new Traffic();
        traffic.setMinSpeedAllowed((short) 30);
        assertEquals(30, traffic.getMinSpeedAllowed());
    }



    @Test
    public void testStreetDirectionFlow() {
        Traffic traffic = new Traffic();
        traffic.setStreetDirectionFlow(StreetDirectionFlow.ONE_WAY);
        assertEquals(StreetDirectionFlow.ONE_WAY, traffic.getStreetDirectionFlow());
    }
}

