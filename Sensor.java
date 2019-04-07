package com.aw.beans;

public class Sensor {
	private int id;
	private String sensorType;
	private String sensorName;
	private String color;

	public void setId(int id) {
		this.id = id;
	}

	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}

	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Sensor [id=" + id + ", sensorType=" + sensorType + ", sensorName=" + sensorName + ", color=" + color
				+ "]";
	}

}
