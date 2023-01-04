7.7 this() constructor

  Using this() to invoke current class constructor

 

/* Java code for using this() to invoke current class constructor*/

class A{

int a; int b;

//Default constructor A() {

 this(10, 20);

/* Explaination: as we know that default constructor invokes first but  during execution default constructor will call first and this(10, 20); method         will redirect it towards parameterized constructor so parameterized constructor will execute first then default constructor will be executed*/

System.out.println(" default constructor \n");

} //Parameterized constructor

A(int a, int b) {

this.a = a;

this.b = b;

System.out.println(" parameterized constructor:"+a+b); }

 public static void main(String[] args) {

A object = new A();

}}

Output:parameterized constructor:30

default constructor 

