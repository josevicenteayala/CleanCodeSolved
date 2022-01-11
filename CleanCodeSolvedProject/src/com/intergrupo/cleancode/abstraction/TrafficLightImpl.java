package com.intergrupo.cleancode.abstraction;

public class TrafficLightImpl implements TrafficLight {
	private TrafficLight actualState = new StopState();
	
	@Override
	public void changeState() {
		actualState.changeState();
	}

	@Override
	public String currentState() {
		return actualState.currentState();
	}	
	
	private class StopState implements TrafficLight{
		private TrafficLight alertState;
		
		@Override
		public void changeState() {
			alertState = new AlertState();
			actualState = alertState;
			sleep();
		}

		@Override
		public String currentState() {
			return STOP_STATE;
		}
		
	}	
	
	private class AlertState implements TrafficLight{
		private TrafficLight followState;
		
		@Override
		public void changeState() {
			followState = new FollowState();
			actualState = followState;
			sleep();
		}

		@Override
		public String currentState() {
			return ALERT_STATE;
		}
		
	}	
	
	private class FollowState implements TrafficLight{
		
		private TrafficLight stopState;
		
		@Override
		public void changeState() {
			stopState = new StopState();
			actualState = stopState;
			sleep();
		}

		@Override
		public String currentState() {
			return FOLLOW_STATE;
		}
		
	}	
	
	private void sleep() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
		}
	}	
	
}
