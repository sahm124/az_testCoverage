package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FootpassengerTest {

    @Test
    public void testCrossedTheCrosswalk() {
        Footpassenger footpassenger = new Footpassenger();
        footpassenger.setCrossedTheCrosswalk(true);
        assertTrue(footpassenger.crossedTheCrosswalk());
    }

    @Test
    public void testLookedToTheRight() {
        Footpassenger footpassenger = new Footpassenger();
        footpassenger.setLookedToTheRight(true);
        assertTrue(footpassenger.lookedToTheRight());
    }

    @Test
    public void testLookedToTheLeft() {
        Footpassenger footpassenger = new Footpassenger();
        footpassenger.setLookedToTheLeft(true);
        assertTrue(footpassenger.lookedToTheLeft());
    }

    @Test
    public void testCrossedTheRoad() {
        Footpassenger footpassenger = new Footpassenger();
        footpassenger.setCrossedTheRoad(true);
        assertTrue(footpassenger.crossedTheRoad());
    }

    @Test
    public void testCrossedTrafficLigth() {
        Footpassenger footpassenger = new Footpassenger();
        footpassenger.setCrossedTrafficLigth(TrafficLigth.GREEN);
        assertEquals(TrafficLigth.GREEN, footpassenger.getCrossedTrafficLigth());
    }
}
