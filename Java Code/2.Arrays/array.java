
// An array is a collection of variables of the same type. 
// When you need to store a list of values, such as numbers, you can store them in an array, instead of declaring separate variables for each number.

// To declare an array, you need to define the type of the elements with square brackets.
// For example, to declare an array of integers:
// int[ ] arr;

// here The name of the array is arr. The type of elements it will hold is int.

// Now, you need to define the array's capacity, or the number of elements it will hold. To accomplish this, use the keyword new.
// int[ ] arr = new int[5];

// The code above declares an array of 5 integers.
// In an array, the elements are ordered and each has a specific and constant position, which is called an index.

// To reference elements in an array, type the name of the array followed by the index position within a pair of square brackets.
// Example:
// arr[1] = 4;

// This assigns a value of 42 to the element with 1 as its index.
// Note: the elements in the array are identified with zero-based index numbers, meaning that the first element's index is 0 rather than one. 
// So, the maximum index of the array int[5] is 4.[0,1,2,3,4]

//  

// Initializing Arrays

// Java provides a shortcut for instantiating arrays of primitive types and strings. 
// If you already know what values to insert into the array, you can use an array literal. 
// Example of an array literal:
// String[ ] myNames = { "l", "r", "0", "89"};
// System.out.println(myNames[0]);

// Outputs :l


// Place the values in a comma-separated lista, enclosed in curly braces. 
// The code above automatically initializes an array containing 4 elements, and stores the provided values.
// Sometimes you might see the square brackets placed after the array name, which also works, but the preferred way is to place the brackets after the array's data type.

