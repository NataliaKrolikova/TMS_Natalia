//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

public class NumberTen {

    public static void main(String[] args) {

        int a = 10;
        int factorial = 1;

            for (int i = 1; i <= a; i++) {
                factorial *= i;
            }
            System.out.println("Факториал: " + factorial);

    }
}