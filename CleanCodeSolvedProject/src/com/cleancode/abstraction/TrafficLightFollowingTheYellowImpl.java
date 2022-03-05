package com.cleancode.abstraction;

public class TrafficLightFollowingTheYellowImpl implements TrafficLight {
	private TrafficLight actualState = new StopState();
	private String previousState;
	
	@Override
	public void changeState() {
		actualState.changeState();
	}

	@Override
	public String currentState() {
		return actualState.currentState();
	}	
	
	private class StopState implements TrafficLight{
		
		@Override
		public void changeState() {
			previousState = actualState.currentState();
			actualState = new AlertState();
			sleep();
		}

		@Override
		public String currentState() {
			return STOP_STATE;
		}
		
	}	
	
	private class AlertState implements TrafficLight{
		private TrafficLight nextState;
		
		@Override
		public void changeState() {
			if (STOP_STATE.equals(previousState)) {
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
		public String currentState() {
			return ALERT_STATE;
		}
		
	}	
	
	private class FollowState implements TrafficLight{
		
		@Override
		public void changeState() {
			previousState = actualState.currentState();
			actualState = new AlertState();
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

	public static void main(String[] args) {
		TrafficLightFollowingTheYellowImpl trafficLightFollowingTheYellowImpl = new TrafficLightFollowingTheYellowImpl();
		for (int i = 0; i < 10; i++) {
			System.out.println("current light "+trafficLightFollowingTheYellowImpl.currentState());
			trafficLightFollowingTheYellowImpl.changeState();
		}
	}
}
