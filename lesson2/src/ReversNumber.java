//Проверено

public class ReversNumber {
    public static void main(String[] args) {

        int n = 1634;
        int a = n%1000;
        int b = a%100;
        int n4 = b%10;
        int n3 = (b-n4)/10;
        int n2 = (a-b)/100;
        int n1 = (n-a)/1000;

        System.out.println(n);
        System.out.println(n4+""+n3+""+n2+""+n1);
    }
}
