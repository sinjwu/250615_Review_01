public class logic_and_relational_operators {
    public static void main(String[] args) {
        int age = 99999;
        boolean korean = true;
        if (age == 30 && korean) {
            System.out.println("저는 올해 계란 한 판이 됐습니다");
        }
        else if ((age > 30 || age <30) && korean) {
            System.out.println(("저의 나이는 " + age + "살입니다"));
        }
        else {
            System.out.println("What the fuck?");
        }

        int a = 10; int b = 12;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a < b);
    }
}
