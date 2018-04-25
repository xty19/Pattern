package com.xty19.pattern.observer;

public class My_Observer implements Observer {

	private  Subject subject;
	public  My_Observer(Subject _subject) 
	{
		this.subject=_subject;
		_subject.registerObserver(this);
	}
	@Override
	public void update(String _msg) 
	{
		System.out.println("My_Observer update msg is :"+_msg);
	}

}
