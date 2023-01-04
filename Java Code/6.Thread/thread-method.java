10.4 methods in a thread

some Methods in a thread are:
join()//ensure that the child thread terminated first
setName()//set the thread name
getName()//get the thread name
setPriority()//set the priority of thread

(MAX_PRIORITY is 10,MIN_PRIORITY is 1,NORM_PRIORITY is 5,default Priority is 5)
thread with higher priority given higher precedence by the thread scheduler to allocate microprocessor time.
getPriority()//get the thread priority
currentThread()//retrive the current thread name
Thread priority :
Example:
class ThreadPriority extends Thread{

public void run(){

System.out.println("running thread name is:"+Thread.currentThread().getName());

System.out.println("running thread priority is:"+Thread.currentThread().getPriority());

}

public static void main(String args[]){

ThreadPriority m1=new ThreadPriority();

ThreadPriority m2=new ThreadPriority();

m1.setPriority(Thread.MIN_PRIORITY);

m2.setPriority(Thread.MAX_PRIORITY);

m1.start();

m2.start();

} } 
output:
running thread name is:Thread-0
running thread priority is:10
running thread name is:Thread-1
running thread priority is:1

