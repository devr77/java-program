6.4 Encapsulation

Encapsulation


The idea behind encapsulation is to ensure that implementation details are not visible to users. 
The variables of one class will be hidden from the other classes, accessible only through the methods of the current class.
This is called data hiding.

￼


To achieve encapsulation in Java, declare the class' variables as private and provide public setter and getter methods to modify and view the variables' values. 

// Java program to demonstrate encapsulation 

public class Encapsulate {

// private variables declared 

// these can only be accessed by 

// public methods of class

private String Name;

private int Roll;

private int Age;

// get method for age to access 

// private variable Age 

public int getAge() {

return Age;   }

// get method for name to access private variable Name

public String getName() {

return Name;  }

// get method for roll to access  private variable Roll

public int getRoll() {

return Roll;

} // set method for age to access  private variable age 

public void setAge( int newAge) {

Age = newAge;

} // set method for name to access  private variable Name 

public void setName(String newName) {

Name = newName;

} // set method for roll to access  private variable Roll 

public void setRoll( int newRoll) {

Roll = newRoll;

} }

public class StudentDetail {

public static void main (String[] args) {

Encapsulate obj = new Encapsulate();

// setting values of the variables 

obj.setName("malik");

obj.setAge(19);

obj.setRoll(89);

// Displaying values of the variables 

System.out.println(" name: " + obj.getName());

System.out.println(" age: " + obj.getAge());

System.out.println(" roll: " + obj.getRoll());

/* Direct access of Roll is not possible due to encapsulation System.out.println(" roll: " + obj.Name);*/

} }


In summary, encapsulation provides the following benefits:
-> Control of the way data is accessed or modified
-> More flexible and easily changed code
-> Ability to change one part of the code without affecting other parts

