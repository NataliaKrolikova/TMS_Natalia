//Создайте число. Определите, является ли число трехзначным. Определите, является
//        ли его последняя цифра семеркой. Определите, является ли число четным.


public class Numbersix {

    public static void main(String[] args) {

        int n = 333;
        int Numberthree = n%10;

        if (n<1000 & n>99) {
            System.out.println("Число " + n + " является трехзначным");
        } else
                System.out.println("Число " + n + " не является трехзначным");


        if (Numberthree != 7) {
            System.out.println("Последняя цифра числа " + n + " не является 7");
        }else
            System.out.println("Последняя цифра числа " + n + " является 7");

        if (n % 2 ==0) {
            System.out.println("Число " + n + " является четным");
        } else {
            System.out.println("Число " + n + " не является четным");
        }

    }
}
