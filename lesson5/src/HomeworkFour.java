//Составьте программу, вычисляющую A*B, не пользуясь операциейумножения.

public class HomeworkFour {

    public static void main(String[] args) {

        int a = 7;
        int b = 13;
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        System.out.println(sum);
    }
}
