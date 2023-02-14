package com.demo.core;

public interface Observer {
	public void update(float temp, float humidity, float presure);

	public String getName();
}
