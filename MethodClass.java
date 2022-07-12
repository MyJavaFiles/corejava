package com.besant.methods;

public class MethodClass {
	String name="Hi";
	
	//PUBLIC - PROJECT
	//PROTECTED - PACKAGE
	//PRIVATE - ONLY WITHIN CLASS.
	
	// access-modifier returnType methodName ( List of parameters)
	
	public void printHello() {
		//MethodClass methodClass= new MethodClass();
		System.out.println("Hello");
		printNumbers();
		
	}
	
	public  void printNumbers() {
		System.out.println("Numbers");
	}

}
