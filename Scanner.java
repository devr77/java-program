// nextInt():Used to read integer value from the user.
// nextFloat():Used to read float value from the user.
// nextDouble():Used to read double value from the user.
// next():Used to read string value without space from the user.
// nextLine():Used to read string value from the user.
// nextByte():Used to read byte value from the user.
// nextShort():Used to read short value from the user.
// nextLong():Used to read long value from the user.

import java.util.Scanner;
class Easy 
{
 public static void main(String[] args)
 {
  //creating the instance of class Scanner
  Scanner obj=new Scanner(System.in);
  String name;
  int rollno;
  float marks;
  System.out.println("Enter your name");
  name=obj.nextLine();//taking string input
  System.out.println("Enter your rollno");
  rollno=obj.nextInt();//taking integer input
  System.out.println("Enter your marks");
  marks=obj.nextFloat();//taking float input
  //printing the output
  System.out.println("Name="+name);
  System.out.println("Rollno="+rollno);
   System.out.println("Marks="+marks);
 }
}