//Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//        произведение, т.е. факториал числа.


public class NumberNine {
    public static void main(String[] args) {

        double averageMul = 0;
        double mul = 1;
        int n = 0;
        int x = (int)(Math.random() * 20);
        while(x != 0) {
            mul *= x;
            n ++;
            x = (int)(Math.random()*20);
            System.out.print(x + " ");
        }
        System.out.println(" ");
        if(n != 0){
            averageMul = mul/n;
        } else {
            averageMul = 0;
        }
        System.out.println("среднее:" + averageMul);
    }
}
