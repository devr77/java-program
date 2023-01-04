8.4 0bject typecasting

Type Casting-object typecasting

For classes, there are two types of casting.

￼

Upcasting (implicit)
You can cast an instance of a subclass to its superclass.
Consider the following example, assuming that Cat is a subclass of Animal.
Animal a = new Cat();

Java automatically upcasted the Cat type variable to the Animal type.

Downcasting(explicit)
Casting an object of a superclass to its subclass is called downcasting.
Example:
Animal a = new Animal();
((Cat)a).makeSound();

This will try to cast the variable a to the Cat type and call its makeSound() method.
Why is upcasting automatic, downcasting manual? 
Well, upcasting can never fail. 
But if you have a group of different Animals and want to downcast them all to a Cat,
then there's a chance that some of these Animals are actually Dogs, so the process fails.

>class >Super {

>void Sample() {

System.out.println("method of super class");

} }

>public >class >Sub >extends Super {

>void Sample() {

System.out.println("method of sub class");

}

>public >static >void main(String args[]) {

Super obj = >new Super();

Sub s = >new Sub();

obj=s;//implicit type casting

obj.Sample();//method of sub class

s=(Sub)obj;//explicit typecasting

s.Sample();//method of sub class

} }

OUTPUT:

method of sub class

method of sub class

Note:-
->Explicit object type casting can be done ,if there is implicit object typecasting before explicit typecasting
->overriding is compulsory
->it is also called as dynamic polymorphism due to inheritance.

