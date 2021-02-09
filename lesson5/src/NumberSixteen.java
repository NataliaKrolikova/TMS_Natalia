//Определите сумму элементов одномерного массива, расположенных между
//        минимальным и максимальным значениями.

import java.util.Random;

public class NumberSixteen {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[10];
        int indexOfMax = 0;
        int indexOfMin = 0;
        System.out.print("");

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(99);
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            } else if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println("The maximum value of the massive is " + array[indexOfMax] + " and its index is " + indexOfMax);
        System.out.println("The minimum value of the massive is " + array[indexOfMin] + " and its index is " + indexOfMin);

        int sum = 0;
        for (int a = indexOfMin + 1; a < indexOfMax; a++) {
            sum += array[a];
        }
        System.out.println("The sum of the massive elements between the max and min values equals to " + sum);
      
    }
}