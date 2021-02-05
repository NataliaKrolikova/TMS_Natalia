//Имеется целое число, определить является ли это число простым, т.е.
//        делится без остатка только на 1 и себя.

public class NumberElleven {

    public static void main(String[] args) {

        int n = 4;

        for ( int i=2; i < n; i++) {
            if ( n % i == 0) {
                System.out.println("Число " + n + " не простое");
            return;
            }
        }
        System.out.println("Число " + n + " простое");
    }
}
