package com.demo.grammer.enumeration.abstractmethod;

public enum TrafficLamp {
	RED(50) {
		@Override
		public TrafficLamp nextLamp() {
			return GREEN;
		}
	},GREEN(60) {
		@Override
		public TrafficLamp nextLamp() {
			return YELLOW;
		}
	},YELLOW(10){
		@Override
		public TrafficLamp nextLamp() {
			return RED;
		}
	};
	public abstract TrafficLamp nextLamp();
	
	@SuppressWarnings("unused")
	private int time;

	TrafficLamp(int time) {
		this.time = time;
	}
}
