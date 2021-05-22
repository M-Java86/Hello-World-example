package com.qa.helloworld;


//Class has scope // it is good practice to indent anything inside of a scope
//because it helps distinguish that contents has belonging to something above itself and 
//helps us get a since of which scope belongs to which object or member. 
//highlight text + TAB-will indent once. 

public class HelloWorld { // A class simply describes attributes or functionality that belongs
	// to it that can be called.

	public static int id;
	public static String msg = "Hello World";

	/// Global variable out side the scope.

	// Method has a scope // A Method is design to store and execute code
	// instructions
	public static void main(String[] args) { // special method of class, first thing a Java application will look..
		
		//printThese(12, 24);
		
		
		
		// for reference to execute.
		// String exampleVar = "Hello World";

		int result;

		result = add(3, 7);

		System.out.println(result);

	}

	public static void printThese(int num1, int num2 ) {
		
		System.out.println(num1);
		System.out.println(num2);
	}

	{

	}

	public static int add(int num1, int num2) { // Method that returns a value
		return num1 + num2; // a keyword is Java .

	}

}

//-
//-Packages walk through, do not create classes in defaultpackage, it is bad practice. 

//-Class members

//-Scope Ownership formatting
//syso Ctrl + space print method
//Ctrl + shift + f -  auto indent 