9.2 built-in(unchecked) or runtime Exception

There are built-in (predefine-(checked and unchecked) and user define exception
-built in exception are as follows:

Built-in exceptions are the exceptions which are available in Java libraries.

These exceptions are suitable to explain certain error situations. 
Below is the list of important built-in exceptions in Java.

Arithmetic Exception
ArrayIndexOutOfBoundException
ClassNotFoundException
FileNotFoundException
IOException
InterruptedException
NoSuchFieldException
NoSuchMethodException
NullPointerException
NumberFormatException
RuntimeException
StringIndexOutOfBoundsException

Examples of Built-in Exception or runtime or unchecked:

Arithmetic exception

// Java program to demonstrate ArithmeticException

class ArithmeticException_Demo {

public static void main(String args[]) {

try {

int a = 30, b = 0;

int c = a/b; // cannot divide by zero

System.out.println ("Result = " + c);

} catch(ArithmeticException e) {

System.out.println ("Can't divide a number by 0"); } } }

Output:
Can't divide a number by 0

