//Вычислить: 1+2+4+8+...+256

public class HomeworkThree {

    public static void main(String[] args) {

        int sum = 0;
        int a = 256;


        for (int i = 1; i <= a; i *= 2) {
            sum += i;
        }
        System.out.println(sum);

    }
}

