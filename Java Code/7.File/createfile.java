12.3 creating a file

Creating Files

Formatter, another useful class in the java.util package, is used to create content and write it to files.
Example:

import java.util.Formatter;

public class MyClass {

public static void main(String[ ] args) {

try {

Formatter f = new Formatter("C:\\Java-learn-with-animation-videos\\testfile.txt");

} catch (Exception e) {

System.out.println("Error");

}

}

}

This creates an empty file at the specified path. If the file already exists, this will overwrite it.
Again, you need to surround the code with a try/catch block, as the operation can fail.

