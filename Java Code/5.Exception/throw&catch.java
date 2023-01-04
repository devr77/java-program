9.6 throw and throws keyword

throw

The throw keyword allows you to manually generate exceptions from your methods. 
Some of the numerous available exception types include the IndexOutOfBoundsException, IllegalArgumentException, ArithmeticException, 
illegalStateException,NumberFormatException etc.. 
For example, we can throw an ArithmeticException in our method when the parameter is 0.
int div(int a, int b) throws ArithmeticException {
if(b == 0) {
throw new ArithmeticException("Division by Zero");
} else {
return a / b;
}
}

The throws statement in the method definition defines the type of Exception(s) the method can throw. 
Next, the throw keyword throws the corresponding exception, along with a custom message "Division by Zero".
If we call the div method with the second parameter equal to 0, it will throw an ArithmeticException with the message "Division by Zero".
Multiple exceptions can be defined in the throws statement using a comma-separated list.

￼