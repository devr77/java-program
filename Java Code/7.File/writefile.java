12.4 writing a file

Writing a File

Once the file is created, you can write content to it using the same Formatter object's format() method.
Example:
import java.util.Formatter;

public class MyClass {

public static void main(String[ ] args) {

try {

Formatter f = new Formatter("C:\\Java-learn-with-animation-videos\\testfile.txt");

f.format("%s %s %s %s", "neelima","yamini", "Sameer","tasnim \r\n");

f.format("%s %s %s %s", "shanthi","HD", "vaishnavi","Anjali");

f.close(); } catch (Exception e) { System.out.println("Error");

}

}

}

The format() method formats its parameters according to its first parameter.


%s mean a string and get's replaced by the first parameter after the format.


The second %s get's replaced by the next one, and so on.


So, the format %s %s %s denotes three strings that are separated with spaces.


Note: \r\n is the newline symbol in Windows.
Don't forget to close the file once you're finished writing to it!
Now the file contains:
neelima yamini Sameer tasnim
shanthi HD vaishnavi Anjali

NOTE:If you want programs on file with explaination go to PROGRAMS

