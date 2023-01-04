6.1.3 Hierarchical Inheritance

Hierarchical Inheritance Example
File: TestInheritance3.java

class Animal{

void eat(){

System.out.println("eating...");

}   }

class Dog extends Animal{

void bark(){

System.out.println("barking...");

}   }

class Cat extends Animal{

void meow(){

System.out.println("meowing...");

} }

class TestInheritance3{

public static void main(String args[]){

Cat c=new Cat();

c.meow();  c.eat();

//c.bark();  //C.T.Error on  c.bark()  }}


Output:

meowing...
eating...
Why multiple inheritance is not supported in java?
To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes.
If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.

Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error.

class A{ 
void msg(){System.out.println("Hello");} 
} 
class B{ 
void msg(){System.out.println("Welcome");} 
} 
class C extends A,B{

/*NOTE: in reality A,B inheritance not possible or multiple inheritance */

/*just assume if it is possible there will be ambiguity as shown below obj.msg()*/

Public Static void main(String args[]){ 
C obj=new C(); 
obj.msg();

//Now which msg() method would be invoked? there will be ambiguity
} 
}

so multiple inheritance is not possible

￼