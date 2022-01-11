package com.intergrupo.cleancode.abstraction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrafficLightFollowingTheYellowImplTest {

	private TrafficLightFollowingTheYellowImpl trafficLightFollowingTheYellowImpl = new TrafficLightFollowingTheYellowImpl();
	
	@Test
	void testChangeState() {
		for (int i = 0; i < 10; i++) {
			System.out.println("actual light "+trafficLightFollowingTheYellowImpl.currentState());
			trafficLightFollowingTheYellowImpl.changeState();
			assertNotNull("Should be an string",trafficLightFollowingTheYellowImpl.currentState());
		}
	}

	@Test
	void testCurrentState() {
		assertNotNull("Should be an string ",trafficLightFollowingTheYellowImpl.currentState());
	}

}
