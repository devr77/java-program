8.2 abstract vs interface vs concrete 

Abstract class

1) Abstract class can have abstract and non-abstract methods.

2) Abstract class doesn't support multiple inheritance.

3) Abstract class can have final, non-final, static and non-static variables.

4) Abstract class can provide the implementation of interface.

5) The abstract keyword is used to declare abstract class.

6) An abstract class can extend another Java class and implement multiple Java interfaces.

7) An abstract class can be extended using keyword extends .

8) A Java abstract class can have class members like private, protected, etc.

9)Example:

public abstract class Shape{

public abstract void draw();//abstract method

public void play(){//non abstract method

//write some code

}

}

Interface

Interface can have only abstract methods. 

Since Java 8, it can have default and static methods alsoInterface supports multiple inheritance.

Interface has only static and final variables.Interface can't provide the implementation of abstract class.

The interface keyword is used to declare interface.

An interface can extend another Java interface only.

An interface class can be implemented using keyword  implements.

Members of a Java interface are public by default.

Example:

public interface Drawable{

void draw();

}

Simply, abstract class achieves partial abstraction whereas interface achieves fully abstraction.

concrete class (normal java class)
Should not declare a concrete class with an abstract access modifier.
Should not contain abstract methods.
abstract class and concrete class in java Instantiation is possible for a concrete class.
abstract class and concrete class in java Variables are not final by default.
abstract class and concrete class in java There is no abstract methods in any level to implement .
abstract class and concrete class in java Interface implementation is possible.
Example:
public class <class name>
{
//variables
//implemented methods
}

