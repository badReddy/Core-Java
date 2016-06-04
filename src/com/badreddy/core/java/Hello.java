package com.badreddy.core.java;

public class Hello {
	static{
		System.out.println("static text");
	}
	{
		System.out.println("instance initializer");
	}
	public Hello(){
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		new Hello();
		System.out.println("Main");
		new Hello();
	}
}
