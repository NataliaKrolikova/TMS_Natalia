//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?

public class True {

    public static void main(String[] args) {

        int n = 4567;
        int a = n%1000;
        int b = a%100;
        int n4 = b%10;
        int n3 = (b-n4)/10;
        int n2 = (a-b)/100;
        int n1 = (n-a)/1000;

        if ((n1 != n2 & n1 != n3 & n1!=n4) & (n2 != n3 & n2 != n4) & (n3 != n4)) {
            System.out.println("Все цифры числа " + n + " различны");
        } else
            System.out.println("Все цифры числа " + n + " не различны");

    }
}
