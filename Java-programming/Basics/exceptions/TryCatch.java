public class TryCatch {

    public static void main(String[] args) {
        try {
            int number1 = 0;
            int number2 = 12;
            int result = number2 / number1;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arith" + e);
        } catch (Exception e) {
            System.out.println("expetion" + e);
        }
    }
}