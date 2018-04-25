package com.xty19.pattern.observer;

public interface Subject 
{
	public void registerObserver(Observer observer);
	
	public void removeObserver(Observer observer);
	
	public void notifyObservers();
}
