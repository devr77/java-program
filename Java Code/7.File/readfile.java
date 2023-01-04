12.2 reading a file

Reading a File

Files are useful for storing and retrieving data, and there are a number of ways to read from a files.
One of the simplest ways is to use the Scanner class from the java.util package.
The constructor of the Scanner class can take a File object as input.
To read the contents of a text file at the path

"C:\\Java-learn-with-animation-videos\\testfile.txt" .
we would need to create a File object with the corresponding path and pass it to the Scanner object.
try {
File x = new File("C:\\Java-learn-with-animation-videos\\testfile.txt");
Scanner sc = new Scanner(x); 
}
catch (FileNotFoundException e) {

}

We surrounded the code with a try/catch block, because there's a chance that the file may not exist.

The Scanner class inherits from the Iterator, so it behaves like one.
We can use the Scanner object's next() method to read the file's contents.
try {
File x = new File("C:\\Java-learn-with-animation-videos\\testfile.txt");
Scanner sc = new Scanner(x);
while(sc.hasNext()) {
System.out.println(sc.next());
}
sc.close();
} catch (FileNotFoundException e) {
System.out.println("Error");
}

The file's contents are output word by word, because the next() method returns each word separately.
It is always good practice to close a file when finished working with it.
One way to do this is to use the Scanner's close() method.

