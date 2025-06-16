public class basic_methods {
    public static void printStudent(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("----------");
    }

    public static void main(String[] args) {
        System.out.println("===학생 명단===");
        printStudent("철수", 23);
        printStudent("영희", 21);
        printStudent("돌쇠", 26);
    }
}
