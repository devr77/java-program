6.2 polymorphism

Polymorphism in Java

Polymorphism, [poly=many ,polymorphism=many forms] which refers to the idea of having [many forms].
it is occured through [Inheritence].

￼
Here is an example of (runtime or dynamic ): Dog and Cat are classes that inherit from the Animal class. Each class has its own implementation of the makeSound() method.

class Animal {

public void makeSound() {

System.out.println("sounds of few animals");

}   }

class Cat extends Animal {

public void makeSound() {

System.out.println("Meow-meow");

}   }

class Dog extends Animal {

public void makeSound() {

System.out.println("Woof-woof");

} //As all Cat and Dog objects are Animal objects, we can do the following in main method;

public static void main(String[ ] args) {

Animal a = new Dog();

Animal b = new Cat();

//We've created two reference variables of type Animal, and pointed them to the Cat and Dog objects.

//Now, we can call the makeSound() methods.

a.makeSound();

b.makeSound();   }   }//end of class


output:Woof-woof
Meow-meow

As the reference variable ' a' contains a Dog a. makeSound() method of the Dog class will be called. 
The same applies to the b variable.
This demonstrates that you can use the Animal variable without actually knowing that it contains an object of the subclass. 
This is very useful when you have multiple subclasses of the superclass.

Here is an example diagram of Dog & Sheep:

￼