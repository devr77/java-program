10.3 implementing thread

The other way of creating Threads is implementing the Runnable interface.
Implement the run() method.
Then, create a new Thread object, pass the Runnable class to its constructor, and start the Thread by calling the start() method.
Example:

class CSE implements Runnable {

public void run() {

System.out.println("Hello");

}

}

class MyClass {

public static void main(String[ ] args) {

Thread t = new Thread(new CSE());

t.start();

} }

output:Hello


The Thread.sleep() method pauses a Thread for a specified period of time.
For example, calling Thread.sleep(1000); pauses the thread for one second. 
Keep in mind that Thread.sleep() throws an InterruptedException, so be sure to surround it with a try/catch block.
It may seem that implementing the Runnable interface is a bit more complex than extending from the Thread class.
However, implementing the Runnable interface is the preferred way to start a Thread, because it enables you to extend from another class, as well.

