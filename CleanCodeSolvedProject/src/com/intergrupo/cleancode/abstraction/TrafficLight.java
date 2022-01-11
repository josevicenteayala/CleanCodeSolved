package com.intergrupo.cleancode.abstraction;

public interface TrafficLight {
	String STOP_STATE = "RED";
	String ALERT_STATE = "YELLOW";
	String FOLLOW_STATE = "GREEN";
	
	public void changeTheState();
	public String currentState();
}
