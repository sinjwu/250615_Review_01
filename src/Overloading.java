public class Overloading {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("a + b = " + add(82988, 28520));
        System.out.println("a + b + c = " + add(27389, 75892,53481));
        System.out.println("a + b = " + add(4.2345894321,5.3450275097));
    }
}
