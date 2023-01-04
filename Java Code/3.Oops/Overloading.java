6.6 Method overloading

Method Overloading

When methods have the same name, but different parameters, it is known as method overloading.
This can be very useful when you need the same method functionality for different types of parameters.(compile or static polymorphism)
The following example illustrates a method that returns the maximum of its two parameters.
Example:

class OverloadingClass{

void sum(int a,long b){

System.out.println(a+b);

}

void sum(int a,int b,int c){

System.out.println(a+b+c);

}

public static void main(String args[]){

OverloadingClass1 obj=new OverloadingClass1();

obj.sum(2,8);

//now second int literal will be promoted to long 

obj.sum(2,20,22); }

}


output:10
44

