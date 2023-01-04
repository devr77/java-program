7.1 static keyword

Static
When you declare a variable or a method as static, it belongs to the class, rather than to a specific instance. This means that only one instance of a static member exists, even if you create multiple objects of the class, or if you don't create any.  It will be shared by all objects.

￼ 

Example:

public class Bank {

public static int Intrest=0;

 Bank() {

Intrest++;

 }}


The intrest variable will be shared by all objects of that class.Now, we can create objects of our Bank class in main, and access the static variable

public class MyClass {

public static void main(String[ ] args) {

System.out.println(Intrest);//output 0 

Bank B1 = new Bank();

Bank B2 = new Bank();

Bank B3 = new Bank();

System.out.println(Bank.Intrest);//output is 3
System.out.println(Intrest);//output is 3  
}}

 

Output:3
The output is 3, because the intrest variable is static and gets incremented by one each time a new object of the Bank class is created. In the code above, we created 3 objects.You can also access the static variable using any object of that class, such as B1.Intrest .It’s a common practice to use upper case when naming a static variable, although not mandatory.

 The same concept applies to static methods.

public class Bike {

public static void horn() {

System.out.println("Beep-beep");

}}


Now, the horn method can be called without creating an object:

public class MyClass {

public static void main(String[ ] args) {

Bike.horn();//valid 

horn();//valid  

}}

 

output:Beep-beep
Another example of static methods are those of the Math class, which is why you can call them without creating a Math object.Also, the main method must always be static.

