package bugs;

public class InvalidMethodArguments {
    public static void main(String[] args) {
        String string = "Hello, world!";
        char result = string.charAt(10);
        System.out.println(result);
    }
}