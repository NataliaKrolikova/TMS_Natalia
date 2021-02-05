//Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
//        таким образом:
//        1 1 1 1 1
//        0 1 1 1 0
//        0 0 1 0 0
//        0 1 1 1 0
//        1 1 1 1 1

public class NumberSeventeen {

    public static void main(String[] args) {

        char[][] array = new char[2][2];
        char[][] array2 = new char[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j <= i) {
                    array[i][j] = '0';
                    array2[i][j] = '1';
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(array2[j][i]);
                System.out.print(array2[j][i]);

            }
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][i]);


            }
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array2[i][j]);
                System.out.print(array2[i][j]);
                System.out.print(array[j][i]);
            }
            System.out.println();
        }
    }

}