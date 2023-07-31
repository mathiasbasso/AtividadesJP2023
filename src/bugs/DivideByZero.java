package bugs;

public class DivideByZero {
    public static void main(String[] args) {
        int number = 10;
        int divisor = 1;
        int result = number / divisor;
        System.out.println(result);
    }
}
