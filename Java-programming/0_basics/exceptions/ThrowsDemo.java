public class ThrowsDemo {
    static void methOne() throws IllegalAccessException {
        System.out.println("Inside method one");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            methOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught:" + e);
        }
    }
}
