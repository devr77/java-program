7.8 this() & super() method in a program

In this topic we are using this() and super() method to know the order of execution of constructor
we will discuss the execution in program it self
Example : order of execution of constructor 

//first go to main method //

-->public static void main(String[] args)

class A {

int a,b;

//Default constructor

A() {

// the execution begins from here

System.out.println("parent default constructor \n"); }

//Parameterized constructor

A(int a, int b) {

//as here also the first statement is this() method which is telling to go to its default constructor A

this();

this.a = a;

this.b = b;

System.out.println("parent parameterized constructor:"+(a+b)); } }

class B extends A {

//Default constructor

B() {

/*here super() method is first statement now super class A parameterized constructor will be called as super() method is parameterized if it is not parameterized then parent class default will be called*/

super(10,20);

System.out.println(" sub class default constructor \n"); }

//Parameterized constructor

B(int x, int y) {

/*parameterized constructor first statement is this() method which means go to default constructor of class B*/

this();

System.out.println("sub class parameterized constructor :"+(a+b));

//valid statement

System.out.println("sub class parameterized constructor:"+(x+y));

//valid statement

}

public static void main(String[] args) {

/*we have created class B object and now it will call class B Parameterized constructor*/

B object = new B(30,30); } }

Output:
parent default constructor

parent parameterized constructor:30
sub class default constructor

sub class parameterized constructor :30
sub class parameterized constructor:60

