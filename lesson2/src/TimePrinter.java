//Проверено

public class TimePrinter {

    public static void main(String ...args) {

        int s = 4500;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hours = h % 24;
        int d = (h - hours) / 24;
        int day = d % 7;
        int week = (d - day) / 7;

        System.out.println(min + " минут " + sec + " секунд");
        System.out.println(h + " час " + min + " минут " + sec + " секунд");
        System.out.println(day + " дней " + h + " час " + min + " минут " + sec + " секунд");
        System.out.println(week + " недель " + day + " дней " + h + " час " + min + " минут " + sec + " секунд");

    }

}
