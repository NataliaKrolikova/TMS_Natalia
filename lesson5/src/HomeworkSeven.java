//Напишите программу, определяющую сумму всех нечетных чисел от 1до 99

public class HomeworkSeven {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 100; i+=2) {

            if (i % 2 != 0) {
                sum += i;
            }

        }
                System.out.println("Сумма:" + sum);

    }
}
