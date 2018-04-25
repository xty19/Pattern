package com.xty19.pattern.observer;

public class My_Observer2 implements Observer {

	private  Subject subject;
	public  My_Observer2(Subject _subject) 
	{
		this.subject=_subject;
		_subject.registerObserver(this);
	}
	@Override
	public void update(String _msg) 
	{
		System.out.println("My_Observer2 update msg is :"+_msg);
	}

}
