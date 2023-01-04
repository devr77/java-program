12.1 working with files

￼

Working with Files

The java.io package includes a File class that allows you to work with files.
To start, create a File object and specify the path of the file in the constructor.

import java.io.File;

File file = new File("C:\\user\\myfirstfile.txt");

With the exists() method, you can determine whether a file exists.

import java.io.File;

public class MyClass { public static void main(String[ ] args) {

File F = new File("C:\\Java-learn-with-animation-videos\\testfile.txt");

if(F.exists()) {

System.out.println(F.getName() + "exists!");

} else {

System.out.println("The file does not exist");

} } }

The code above prints a message stating whether or not the file exists at the specified path.
The getName() method returns the name of the file.
Note: we used double backslashes in the path, as one backslash should be escaped in the path String.

