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

        int insertedcoin = 2000;
        switch(insertedcoin) {
            case (1000):
                System.out.println("생수");
                break;
            case (1500):
                System.out.println("사이다");
                break;
            case (2000):
                System.out.println("콜라");
                break;
            default:
                System.out.println("잘못된 입력입니다");
        }
    }
}
