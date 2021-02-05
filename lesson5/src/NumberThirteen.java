//Создать последовательность случайных чисел, найти и вывести наибольшее
//        из них.


import java.util.Random;

public class NumberThirteen {

    public static void main(String[] args) {

      Random rand = new Random();
        int[] array = new int[10];
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(60);

            if (array[i]>max) max = array [i];
                System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Максимальное число " + max);

    }
}
