//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//        полностью закрыть круглой картонкой радиусом r.

public class Square {
    public static void main(String[] args) {

        int a = 1;
        int b =2;
        int r = 4;

        if (4 * r * r >= (a * a + b * b)) {
            System.out.println("Можно");
        } else {
            System.out.println("Нельзя");

        }

    }
}
