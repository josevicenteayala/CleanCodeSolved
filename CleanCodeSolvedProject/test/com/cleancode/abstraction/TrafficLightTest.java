package com.cleancode.abstraction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cleancode.abstraction.TrafficLight;
import com.cleancode.abstraction.TrafficLightImpl;

class TrafficLightTest {

	private TrafficLight trafficLight = new TrafficLightImpl();
	
	@Test
	void testChangeState() {
		for (int i = 0; i < 10; i++) {
			System.out.println("actual light "+trafficLight.currentState());
			trafficLight.changeState();
			assertNotNull("Should be an string",trafficLight.currentState());
		}
	}

	@Test
	void testCurrentState() {
		assertNotNull("Should be an string ",trafficLight.currentState());
	}

}
