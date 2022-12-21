// 1.Converting int to String and Strings to int 
// String a = String.valueOf(2);   //integer to numeric string
// int i = Integer.parseInt(a); //numeric string to an int

// Converting String to date in Java
// java.util.Date = java.text.DateFormat.getDateInstance().parse(date String);

// SimpleDateFormat format = new SimpleDateFormat( "dd.MM.yyyy" );
// Date date = format.parse( myString );

// Converting Array to Map in Java
// import java.util.Map;
// import org.apache.commons.lang.ArrayUtils;

// public class Main {
//     public static void main(String[] args) {
//         String[][] countries = { { "United States", "New York" }, { "United Kingdom", "London" },
//                 { "Netherland", "Amsterdam" }, { "Japan", "Tokyo" }, { "France", "Paris" } };
//         Map countryCapitals = ArrayUtils.toMap(countries);
//         System.out.println("Capital of Japan is " + countryCapitals.get("Japan"));
//         System.out.println("Capital of France is " + countryCapitals.get("France"));
//     }
// }