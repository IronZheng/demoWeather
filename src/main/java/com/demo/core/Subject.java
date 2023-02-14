package com.demo.core;

public interface Subject {

	public void notifyAllObserver();

	public void register(Observer observer);
	
	public void remove(Observer observer);

	
}

