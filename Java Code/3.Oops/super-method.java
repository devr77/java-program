7.4 super method

 

Use of super with methods: 
This is used when we want to call parent class method. 
So whenever a parent and child class have same named methods then to resolve ambiguity we use super keyword.

lets us understand by a realtime example:

/* parent class Person */

class Person {

void message() {

System.out.println("This is person class");

} }

/* Subclass Student */

class Student extends Person {

void message() {

System.out.println("This is student class");

}

// Note that display() is only in Student class

void display() {

// will invoke or call current class message() method

message();

// will invoke or call parent class message() method

super.message(); } }

/* main class program to test output */

class MainClass { public static void main(String args[]) {

Student st = new Student(); // calling display() of Student

st.display();

} }


Output:

This is student class
This is person class
In the above example, we have seen that if we only call method message() 
then, the current class message() is invoked but 
with the use of super keyword, message() of superclass could also be invoked.

 

