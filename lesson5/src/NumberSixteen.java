//Определите сумму элементов одномерного массива, расположенных между
//        минимальным и максимальным значениями.

import java.util.Random;

public class NumberSixteen {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[10];
        System.out.print("");

        int max = 0;
        int min = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(99);
            sum += array[i];
           if (max <= array[i]) {
                max = array[i];
           } else if (min >= array[i]) {
               min = array[i];

           }

        }
        System.out.println("Сумма элементов " + sum);

    }
}