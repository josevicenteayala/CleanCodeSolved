package com.intergrupo.cleancode.abstraction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrafficLightFollowingTheYellowImplTest {

	private TrafficLightFollowingTheYellowImpl trafficLightFollowingTheYellowImpl = new TrafficLightFollowingTheYellowImpl();
	
	@Test
	void testChangeTheState() {
		for (int i = 0; i < 10; i++) {
			System.out.println("actual light "+trafficLightFollowingTheYellowImpl.currentState());
			trafficLightFollowingTheYellowImpl.changeTheState();
			assertNotNull("Should be an string",trafficLightFollowingTheYellowImpl.currentState());
		}
	}

	@Test
	void testActualState() {
		assertNotNull("Should be an string ",trafficLightFollowingTheYellowImpl.currentState());
	}

}
