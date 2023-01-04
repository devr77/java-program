10.2 extending thread

There are two ways to create a thread.
 1.Extend the Thread class
Inherit from the Thread class, override its run() method, and write the functionality of the thread in the run() method.
Then you create a new object of your class and call it's start method to run the thread.
Example:

class CSE extends Thread {

public void run() {

System.out.println("Hello");

} }

class MyClass {

public static void main(String[ ] args) {

CSE obj = new CSE();

obj.start();

} }

output:Hello

