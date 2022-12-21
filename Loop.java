// public class Loop{
//      public static void main(String[] args) {
// 		String[] myArray = {"a", "b", "c", "d", "e"};
// 		for (int i= 0;i < myArray.length;i++)
// 		{
// 			System.out.println(myArray[i]);
// 		}
// 	}
// }

// public class Loop{
//      public static void main(String[] args) {
// 		String[] myArray = {"a", "b", "c", "d", "e"};
// 		for(String TString:myArray){
// 			System.out.println(TString);
// 		}
// 	}
// }


// public class Loop{
//      public static void main(String[] args) {
// 		String[] myArray = {"a", "b", "c", "d", "e"};
// 		for (int i= 0;i < myArray.length;i++)
// 		{
// 			System.out.println(myArray[i]);
// 		}
// 	}
// }

// int i = 0;
// while (i < myArray.length) {
//   System.out.println(myArray[i]);
  
//   i++;
// }

// if (myArray.length > 0) {
//   int i = 0;
//   do {
//     System.out.println(myArray[i]);
//     i++;
//   } while (i < myArray.length);
// }


// Arrays.asList(myArray).stream().forEach(System.out::println);

// Arrays.asList(myArray).stream().map(element -> {
//   System.out.println(element);
//   return element;
// });

// String[] transformedArray = Arrays.asList(myArray).stream().map(element - > "character: " + element).toArray(String[]::new);
// just to print the transformed array
// for (int i = 0; i < transformedArray.length; i++) {
//   System.out.println(transformedArray[i]);
// }



// Arrays.asList(myArray).stream().filter(element -> {
//   return true;
// }).forEach (System.out::println);