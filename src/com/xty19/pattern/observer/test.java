package com.xty19.pattern.observer;

public class test 
{
	public static void main(String[] args) 
	{
		My_Subject my_Subject=new My_Subject();
		My_Observer my_Observer=new My_Observer(my_Subject);
		My_Observer2 my_Observer2=new My_Observer2(my_Subject);
		
		my_Subject.setMsg("haha");
		
	}
}
