
package com.aw.beans;

public class Microprocessor {
	private int id;
	private String microType;
	private String microName;
	private String color;

	public void setId(int id) {
		this.id = id;
	}

	public void setMicroType(String microType) {
		this.microType = microType;
	}

	public void setMicroName(String microName) {
		this.microName = microName;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Microprocessor [id=" + id + ", microType=" + microType + ", microName=" + microName + ", color=" + color
				+ "]";
	}
}
