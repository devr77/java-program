9.4 user define exception

user define Exception:
public class Demo extends Exception {

public Demo(String s){

super(s);//prints balance

}

}

class Bank{

public static void main(String args[]) throws Demo {

//throws can only be used for checked exception and It is throw by the programmer

int balance=8000,expenditure=6000;

if(balance>expenditure){

Demo d=new Demo(" balance");

throw d;

//throw is used by language designer and is alternative way for try catch block

}

}          } 

