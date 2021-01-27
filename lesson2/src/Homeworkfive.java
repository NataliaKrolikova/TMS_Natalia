//Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.

public class Homeworkfive {

    public static void main(String[] args) {

        int a = -10;
        int b = -15;
        int c = 20;
        int x = 0;
        int y = 0;

        if (a>=0) x = x+1;
        else y = y+1;

        if (b >= 0) x = x + 1;
        else y = y + 1;

        if (c >= 0) x = x + 1;
        else y = y + 1;

        System.out.println("количество отрицательных чисел: " + y);
        System.out.println("количество положительных чисел: " + x);
        }
    }
