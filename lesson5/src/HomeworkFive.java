//Напишите программу печати таблицы перевода расстояний из дюймов всантиметры для значений длин от 1 до 20 дюймов.
//        1 дюйм = 2,54 см

public class HomeworkFive {

    public static void main(String[] args) {

        double sm =0;
        for (int i=1; i<=20; i++) {

            sm +=2.54;

            System.out.println(i + " дюйм равно " + " " + sm + " см");
        }
    }
}
