//Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.

public class Homeworkfive {

    public static void main(String[] args) {

        int a = -10;
        int b = -15;
        int c = 20;

        if (a>0 & b>0 & c>0) {
            System.out.println("3 числа положительные");
        } else if (a<0 & b<0 & c<0) {
            System.out.println("3 числа отрицательные");
        } else if ((a<0 & b<0 & c>0) | (a<0 & b>0 & c<0) | (a>0 & b<0 & c<0)) {
            System.out.println("2 числа отрицательные и 1 положительное");
        } else if ((a<0 & b>0 & c>0) | (a>0 & b<0 & c>0) | (a>0 & b>0 & c<0)) {
            System.out.println("1 число отрицательное и 2 положительные");
        }
    }
}
