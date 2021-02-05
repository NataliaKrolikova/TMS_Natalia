//Найдите сумму первых n целых чисел, которые делятся на 3.

public class NumberTwelve {

    public static void main(String[] args) {

        int n = 3;
        int k = 1;
        int sum = 0;
        for (int i = 1; k <= n; i++) {
            if (i % 3 == 0) {
                k++;
                sum += i;
                System.out.println(i);
            }

        }
        System.out.println("Cyммa : " + sum);

    }
}