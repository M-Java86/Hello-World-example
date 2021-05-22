package com.qa.helloworld;

//Class has scope
public class HelloWorld {
	
	public static int id;
	
	
	// Method has a scope
	public static void main(String [] args) {
		String exampleVar = "Hello World";
		
		System.out.println(exampleVar);
	}
	
	
}

	
	 
//-
//-Packages walk through, do not create classes in defaultpackage, it is bad practice. 

//-Class members