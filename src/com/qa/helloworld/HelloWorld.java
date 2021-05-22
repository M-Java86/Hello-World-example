package com.qa.helloworld;

//Class has scope
public class HelloWorld {
	
	public static int id;
	public static String msg = "Hello World";
	
	
	// Method has a scope
	public static void main(String [] args) { // special method of class, first thing a Java application will look..
		//for reference to execute. 
		//String exampleVar = "Hello World";
		
		WelcomeMsg();//-first System operand 
		
		System.out.println(msg);
	}
	
	//Bonus Task
	public static void WelcomeMsg() { // Second System operand
		System.out.println("Method-Hello World"); // has two system operands, which printed out two "Hello World" in the console.
		System.out.println("Method-Hello World");
		System.out.println("Method-Hello World");
	}
	
}

	
	 
//-
//-Packages walk through, do not create classes in defaultpackage, it is bad practice. 

//-Class members