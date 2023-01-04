//class is a keyword to define new class 
//HelloWorld is the name of our claass 

class HelloWorld
{
/*
* public: So that JVM can execute the method from anywhere.
* static: Main method is to be called without object. 
* The modifiers public and static can be written in either order. 
* void: The main method doesn't return anything. 
* main(): Name configured in the JVM. 
* String[]: The main method accepts a single argument: 
an array of elements of type String. 
*/


public static void main(String args[]) 
/* 
* "System" is a class in the java.lang package. 
* "out" is a static member of the System class, 
* and is an instance of java.io.PrintStream.
* "println" is a method of java.io.PrintStream. 
* This method is overloaded to print message to output destination. */


System.out.println("Hello, World"); 
} 


