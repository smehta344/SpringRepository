package com.aw.beans;

public class Robot {
	private Sensor sensor;
	private Microprocessor microprocessor;

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	public void setMicroprocessor(Microprocessor microprocessor) {
		this.microprocessor = microprocessor;
	}

	@Override
	public String toString() {
		return "Robot [sensor=" + sensor + ", microprocessor=" + microprocessor + "]";
	}

}
