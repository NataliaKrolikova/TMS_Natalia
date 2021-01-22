//Создайте число. Определите, является ли число трехзначным. Определите, является
//        ли его последняя цифра семеркой. Определите, является ли число четным.


public class Numbersix {

    public static void main(String[] args) {

        int n = 333;
        int a = n%100;
        int n3 = a%10;
        int n2 = (a-n3)/10;
        int n1 = (n-a)/100;

        if (n<1000) {
            System.out.println("Число n является трехзначным");

        }
            System.out.println(n3 == 7);

        if (n%2==0) {
            System.out.println("Число " + n + " является четным");
        } else {
            System.out.println("Число " + n + " не является четным");
        }


    }
}
