//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе

public class Homeworkfor {

    public static void main(String[] args) {

        int a = 3;
        int b = 6;
        int c = 32;
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