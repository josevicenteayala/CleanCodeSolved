package com.intergrupo.cleancode.abstraction;

public class TrafficLightFollowingTheYellowImpl implements TrafficLight {
	private TrafficLight actualState = new StopState();
	private String previousState;
	
	@Override
	public void changeTheState() {
		actualState.changeTheState();
	}

	@Override
	public String actualState() {
		return actualState.actualState();
	}	
	
	private class StopState implements TrafficLight{
		private TrafficLight alertState;
		
		@Override
		public void changeTheState() {
			previousState = actualState.actualState();
			alertState = new AlertState();
			actualState = alertState;
			sleep();
		}

		@Override
		public String actualState() {
			return STOP_STATE;
		}
		
	}	
	
	private class AlertState implements TrafficLight{
		private TrafficLight nextState;
		
		@Override
		public void changeTheState() {
			if(STOP_STATE.equals(previousState)) {
				nextState = new FollowState();
				actualState = nextState;
				sleep();	
			}else {
				nextState = new StopState();
				actualState = nextState;
				sleep();
			}
		}

		@Override
		public String actualState() {
			return ALERT_STATE;
		}
		
	}	
	
	private class FollowState implements TrafficLight{
		
		private TrafficLight alertState;
		
		@Override
		public void changeTheState() {
			alertState = new AlertState();
			actualState = alertState;
			sleep();
		}

		@Override
		public String actualState() {
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
