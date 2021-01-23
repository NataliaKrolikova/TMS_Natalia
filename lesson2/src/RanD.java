//Имеется целове число (задать с помощью Random rand = new Random(); int x =
//        rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//        нему слово «рублей» в правильном падеже.


import java.util.Random;

public class RanD {
    public static Random rand = new Random();

    public static void main(String[] args) {

        int x = rand.nextInt(15);

        if (x % 10 == 0 | x % 10 >=5 | x % 100 >=11) {
            System.out.println(x + " рублей");

        } else if (x % 10 == 1) {
            System.out.println(x + " рубль");

        } else {
            System.out.println(x + " рубля");
        }

    }

}

