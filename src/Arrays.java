public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("배열 요소 출력");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("number[" + i + "]: " + numbers[i]);
        }

        int[] numbersA = {2, 4, 6, 8, 10};
        int sum = 0;
        for(int j = 0; j < numbersA.length; j++) {
            sum += numbersA[j];
        }
        System.out.println(sum);
    }
}
