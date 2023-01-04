7.5 super constructor

Use of super with constructors:
super keyword can also be used to access the parent class constructor.
ets us understand by a realtime example:

/* superclass Person */

class Person {

Person() {

System.out.println("Person class Constructor");

} }

/* subclass Student extending the Person class */

class Student extends Person {

Student() {

// invoke or call parent class constructor

super();

System.out.println("Student class Constructor");

} }

/* main class program to test output*/

class MainClass {

public static void main(String[] args) {

Student st = new Student(); } }

Output:

Person class Constructor
Student class Constructor
In the above example we have called the superclass constructor 
using keyword ‘super’ via subclass constructor.

rules for using super keyword:

Call to super() method must be first statement in Derived(Student) Class constructor.
Note:-you cannot use super() and this() method at a time because rule is they must be the first statement.


If a constructor does not explicitly invoke a superclass constructor, 
the Java compiler automatically inserts a call to the no-argument constructor of the superclass.


If the superclass does not have a no-argument constructor, 
you will get a compile-time error.


Object does have such a constructor, 
so if Object is the only superclass, there is no problem.


If a subclass constructor invokes a constructor of its superclass, either explicitly or implicitly,
you might think that a whole chain of constructors called ie. constructor chaining

