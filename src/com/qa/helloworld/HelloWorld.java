package com.qa.helloworld;

//Class has scope
public class HelloWorld {
	
	public static int id;
	public static String msg = "Hello World";
	
	
	// Method has a scope
	public static void main(String [] args) {
		//String exampleVar = "Hello World";
		
		WelcomeMsg();
		
		System.out.println(msg);
	}
	
	//Bonus Task
	public static void WelcomeMsg() { 
		System.out.println("Hello World");
		
	}
	
}

	
	 
//-
//-Packages walk through, do not create classes in defaultpackage, it is bad practice. 

//-Class members