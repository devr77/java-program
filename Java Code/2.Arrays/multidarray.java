// 4.4 MultiDementional Array

//  Multidimensional Arrays

// Multidimensional arrays are array that contain other arrays. The two-dimensional array is the most basic multidimensional array. 
// To create multidimensional arrays, place each array within its own set of square brackets.
// Example of a two-dimensional array:
// ￼

// int[ ][ ] mytwoDarray= { {1, 2, 3}, {4, 5, 6} };

// This declares an array with two arrays as its elements.
// To access an element in the two-dimensional array, provide two indexes, one for the array, and another for the element inside that array. 
// The following example accesses the first element in the second array of mytwoDarray
// int x = mytwoDarray[1][0];
// System.out.println(x);

// Output: 4

// You can get and set a multidimensional array's elements using the same pair of square brackets.
// Example:
// int[ ][ ] mythreeDarray = { {1, 2, 3}, {4}, {5, 6, 7} };
// mythreeDarray[0][2] = 42;
// int x = mythreeDarray[1][0]; 
// output:4

// The above two-dimensional array contains three arrays. The first array has three elements, the second has a single element and the last of these has three elements. 
// In Java, you're not limited to just two-dimensional arrays. 
// Arrays can be nested within arrays to as many levels as your program needs. 
// All you need to declare an array with more than two dimensions, is to add as many sets of empty brackets as you need.
// note: that all array members must be of the same type.

// ￼