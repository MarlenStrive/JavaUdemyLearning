package com.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		byte b = 10;
		//short a = 200;
		//int c = b + 23;
		//long myLongValue = 123456789876L;
		long anotherLongValue = 123_456_789_876L;
		
		System.out.println("b = " + b);
		System.out.println("a = " + anotherLongValue);
		
		//float myFloatVal = 23.56F;
		//double myDoubleVal = 56.45D;
		
		System.out.println("set: " + 'A' + 'b' + '^' + '\u00B6');
		
		int someInt = (int) anotherLongValue;
		System.out.println("someInt = " + someInt);
		
	}
}

// sout - shortcut for System.out.println()