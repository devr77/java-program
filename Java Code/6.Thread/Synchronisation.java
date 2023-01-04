10.5 synchronization

When more than one thread tries to access a shared resource, we need to ensure that resource will be used by only one thread at a time.

The process by which this is achieved is called synchronization.

The synchronization keyword in java creates a block of code referred to as critical section.

Every Java object with a critical section of code gets a lock associated with the object. To enter critical section a thread need to obtain the corresponding object's lock.

EXAMPLE:

package _5Synchronize;

import java.util.Scanner;

public class Sync_Demo {

public static int count=0;

static Scanner sc =new Scanner(System.in);

static int c;

public synchronized static void incount() {

/*Synchronized keyword in Java is used to

* provide mutually exclusive access to a shared resource with multiple threads in Java.

* Synchronization in Java guarantees that

* no two threads can execute a synchronized method 

* which requires the same lock simultaneously or concurrently.

*/ count++;

}

public static void main(String a[]){

System.out.println("enter no of tickets");

c=sc.nextInt();

if(c>2000){

System.out.println("you are entering the tickets more than its stock"); System.exit(0);

} Thread t1=new Thread(new Runnable(){

@Override public void run() {

for(int i=0;i<1000;i++){ incount();

}

}} );

Thread t2=new Thread(new Runnable(){

@Override public void run() {

for(int i=0;i<1000;i++){

incount(); } }} );

t1.start();

t2.start();

try{

t1.join();

t2.join();

}

catch(InterruptedException e){

e.printStackTrace();

}

System.out.println("tickets are :"+count);

System.out.println("tickets left :"+(count-c));

} }

OUTPUT:

enter no of tickets

124

tickets are :2000

tickets left :1876

output 2:

enter no of tickets

20001

you are entering the tickets more than its stock

10.6 why synchronization

Why use Syncronization?

If we do not use syncronization, and let two or more threads access a shared resource at the same time, it will lead to distorted results

For example:

Suppose we have two different threads T1 and T2, T1 starts execution and save certain values in a file file1.txt which will be used to calculate some result when T1 returns.

Meanwhile, T2 starts and before T1 returns, T2 change the values saved by T1 in the file file1.txt (file1.txt is the shared resource).

Now obviously T1 will return wrong result.

To prevent such problems, synchronization was introduced.

With synchronization in above case, once T1 starts using file1.txt  file, this file will be locked(LOCK mode), and no other thread will be able to access or modify it until T1 returns.

