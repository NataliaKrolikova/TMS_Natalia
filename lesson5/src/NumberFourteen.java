//Создать массив оценок произвольной длины, вывести максимальную и
//        минимальную оценку, её (их) номера.

import java.util.Random;

public class NumberFourteen {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[7];
        int min = 0;
        int minindex = 0;
        int max = 0;
        int maxindex = 0;

        for (int i =0; i< array.length; i++) {
            array[i] = rand.nextInt(33);

            if (array[i] > max) {
                max = array[i];
                maxindex = i;
            }
            if (min == 0) min = array[i];
            if (array[i] <= min) {
                min = array[i];
                minindex = i;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Максимальная оценка " + max + " ее индекс: " + maxindex);
        System.out.println("Минимальная оценка " + min + " ее индекс: " + minindex);

    }
}