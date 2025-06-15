public class ifswitch {
    public static void main(String[] args)  {
        int age = 27;
        if (age < 20) {
            System.out.println("미성년자 출입 불가");
        }
        else if (age <= 25) {
            System.out.println("신분증 검사할게요");
        }
        else {
            System.out.println("이랏샤이마세");
        }
    }
}
