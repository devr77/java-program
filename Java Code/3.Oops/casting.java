8.3 data type casting

Type Casting-Datatype casting
Type casting is of two types -

￼

-datatype casting [implicit(widening or upcasting),explicit(narrowing or downcasting)]
-object typecasting[implicit and explicit]
converting object or datatype of one for to another form. 

To cast a value to a specific type, place the type in parentheses and position it in front of the value.
Example:
int a = (int) 3.98;
System.out.println(a);
Output: 3

The code above is casting the value 3.98 to an integer, with 3 as the resulting value.
Another example:
double a = 14.123;
int b = (int) a;
System.out.println(b);
Output: 14
NOTE:
->Java supports automatic type casting of integers to floating points, since there is no loss of precision.
->On the other hand, type casting is mandatory when assigning floating point values to integer variables.

let us see datatype casting (implicit and explicit):
Example:
class Test {

public static void main(String[] args) {

int x = 20;

double y=90;

double z=30.9090;

System.out.println(x);//20

y=x;//implicit datatype casting

//here we have convert integer to double there is no loss of precision data System.out.println(y);//20.0

x=(int)z;//explicit type casting

System.out.println(x);//30 

//here there is a loss of precision in explicit type conversion

}   }

