6.1.1 inheritance

Inheritance in java

Inheritance is the process that enables one class to acquire the properties (methods and variables) of another. 
With inheritance, the information is placed in a more manageable, hierarchical order.

The class inheriting the properties of another is the subclass (also called derived class, or child class); 
the class whose properties are inherited is the superclass (base class, or parent class).

To inherit from a class, use the (extend) keyword. 
This example shows how to have the class Dog to inherit from the class Animal.

class Dog extends Animal {
// code block
}

Here, Dog is the subclass(child class), and Animal is the superclass(parent class).

uses of inheritance:
->For Method Overriding (so runtime polymorphism can be achieved).
->For Code Reusability.

Terms used in Inheritance
Class: A class is a group of objects which have common properties. 
It is a template or blueprint from which objects are created.

Sub Class/Child Class: Subclass is a class which inherits the other class. 
It is also called a derived class, extended class, or child class.


Super Class/Parent Class: Superclass is the class from where a subclass inherits the features.
It is also called a base class or a parent class.


Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class. 
You can use the same fields and methods already defined in the previous class.

Single Inheritance Example:

class Animal{

void eat(){

System.out.println("eating...");

}     }

class Dog extends Animal{

void bark(){

System.out.println("barking...");

}    }

class TestInheritance{

public static void main(String args[]){

Dog d=new Dog();

d.bark();     d.eat();

}    }


Output:

barking...
eating...

Real World Example Diagram:

￼