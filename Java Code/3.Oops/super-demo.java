7.3 super keyword


The super keyword in java is a reference variable that is used to refer parent class objects. 
The keyword “super” came into the account with the concept of Inheritance.

Use of super with variables: 
This scenario occurs when a derived class and parent class has same data members. 
In that case there is a possibility of ambiguity for the JVM. 
lets us understand by a realtime example:

/* parent class vehicle */

class Vehicle {

int maxSpeed = 100;

}

/* sub class Car extending vehicle */

class Car extends Vehicle {

int maxSpeed = 150;

void display() {

/* print maxSpeed of parent class (vehicle) */

System.out.println("Maximum Speed is: " + super.maxSpeed);

} }

/* main class program to test output*/

class MainClass {

public static void main(String[] args) {

Car c = new Car();

c.display();

} }


Output:

Maximum Speed is: 100
In the above example, both parent class and subclass have a same member or variable maxSpeed. 
We could access maxSpeed of parent class in sub class using super keyword.

 

