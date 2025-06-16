public class break_continue {
    public static void main(String[] args){
        for (int i = 0; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

        for (int j = 1; j <= 100; j++) {
            if (j % 5 != 0) {
                continue;
            }
            System.out.println(j);
        }
    }
}
