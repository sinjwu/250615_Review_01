public class forwhile {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " × " + j + " = " + i * j);
            }
        }

        int k = 1;
        while (k <= 10) {
            System.out.println(k);
            k++;
        }

        int l = 10;
        do {
            System.out.println(l);
            l--;
        } while (l >= 0);
    }
}
