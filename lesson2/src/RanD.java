//Имеется целове число (задать с помощью Random rand = new Random(); int x =
//        rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//        нему слово «рублей» в правильном падеже.


import java.util.Random;

public class RanD {
    public static Random rand = new Random();

    public static void main(String[] args) {

        int x = rand.nextInt(1000);

        if (x % 10 == 0 | (x % 10 <=9 & x % 10 >=5) | (x%100>=11 & x%100<=14)) {
            System.out.println(x + " рублей");

        } else if (x % 10 == 1) {
            System.out.println(x + " рубль");

        } else if (x % 10 >=2 & x % 10 <=4) {
            System.out.println(x + " рубля");
        }

    }

}

