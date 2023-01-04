Steve jobs Biography8.7 equals() method

Comparing Objects

Remember that when you create objects, the variables store references to the objects.
So, when you compare objects using the equality testing operator (==), it actually compares the references and not the object values.
Example:
class CSE {

String StudentStudentname;

CSE(String Studentname) {

StudentStudentname = Studentname;

}     }

class MyClass {

public static void main(String[ ] args) {

CSE a1 = new CSE("Aayush");

CSE a2 = new CSE("AayusH");

System.out.println(a1 == a2);

}    } 
Output: false
Despite having two objects with the same Studentname, the equality testing returns false,
because we have two different objects (two different references or memory locations).

equals() Example:
Book firstBook = new Book("Steve jobs Biography");

Book secondBook = new Book("sTeve jobs Biography");

if (firstBook.equals(secondBook)) {

System.out.println("objects are equal");

}

else {

System.out.println("objects are not equal");

} 
output:objects are not equal

