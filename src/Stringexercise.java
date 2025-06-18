public class Stringexercise {
    public static void main(String[] args) {
        String message = "Hello, Java!";
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.substring(0, 5));
        System.out.println(message.substring(6));
        System.out.println(message.indexOf('l'));
        System.out.println(message.indexOf('J'));

        String greeting = "Hello, Alice!";
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.length());
    }
}
