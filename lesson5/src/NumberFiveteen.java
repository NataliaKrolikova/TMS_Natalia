//Создать массив, заполнить его случайными элементами, распечатать,
//        перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//        еще один массив).

import java.util.Random;

public class NumberFiveteen {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[11];
        int i;
        int tmp;

        for (i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(25);
            System.out.print(array[i] + " ");
        }

        for (i = 0; i < array.length / 2; i++) {

            tmp = array[i];
            array[i] = array[(array.length - 1 - i)];
            array[(array.length - 1 - i)] = tmp;
        }
        System.out.print("\n" + "перевернутый массив ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}