package com.intergrupo.cleancode.abstraction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrafficLightTest {

	private TrafficLight trafficLight = new TrafficLightImpl();
	
	@Test
	void testChangeTheState() {
		for (int i = 0; i < 10; i++) {
			System.out.println("actual light "+trafficLight.currentState());
			trafficLight.changeTheState();
			assertNotNull("Should be an string",trafficLight.currentState());
		}
	}

	@Test
	void testActualState() {
		assertNotNull("Should be an string ",trafficLight.currentState());
	}

}
