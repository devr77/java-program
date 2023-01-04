// 4.5 wrapper class

// As the name says, a wrapper class wraps (encloses) around a data type and gives it an object appearance. 
// Wherever, the data type is required as an object, this object can be used. Wrapper classes include methods to unwrap the object and give back the data type. 
// It can be compared with a chocolate. The manufacturer wraps the chocolate with some foil or paper to prevent from pollution. The user takes the chocolate, removes and throws the wrapper and eats it. 

// The list of eight wrapper classes are given below:
// Primitive Type => Wrapper class
// boolean => Boolean
// char => Character
// byte => Byte
// short => Short
// int => Integer
// long => Long
// float => Float
// double => Double

// Creating objects of the Wrapper classes
// All the wrapper classes have constructors which can be used to create the corresponding Wrapper class 
// For example
// Integer intObject = new Integer (15);

// Retrieving the value wrapped by a wrapper class object
// Each of the eight wrapper classes have a method to retrieve the value that was wrapped in the object. 
// For example, to retrieve the value stored in the Integer object intObject, we use the following statement. 
// int x = intObject.intValue();

// Similarly, we have methods for the other seven wrapper classes: byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue(). 

// Auto boxing and auto unboxing
// Above given method can become quite cumbersome. 
// As an alternative, there exists auto boxing and autounboxing.
// Auto boxing refers to an implicit call to the constructor and auto unboxing refers to an implicit call to the *value() method. 

// Therefore, a new wrapper object can be created by specifying the value to be wrapped just as we would do for a primitive data type variable. Also, the value can be retrieved and used in a simple way by specifying the object name.
// Look at the following code:
// Integer intObject = 34;
// int x=intObject;
// int x = intObject + 7;

// The above statements are equivalent to the following set of statements
// Integer intObject = new Integer (34);
// int x = intObject.intValue();
// int x = intObject .intValue()+ 7;
// Similarly, auto boxing and auto boxing apply to other wrapper classes also.

