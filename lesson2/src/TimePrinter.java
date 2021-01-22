public class TimePrinter {

    public static void main(String ...args) {

        int s = 4500;
        int min = s/60;
        int sec = s-(min*60);

        System.out.println(min + " минут " + sec + " секунд");

        sec = s%60;
        int m = (s-sec)/60;
        min = m%60;
        int h = (m-min)/60;

        System.out.println(h + " часов " + min + " минут " + sec + " секунд");

        int d = 24*3600;
        int day = s/d;

        System.out.println(day + " дней " + h + " часов " + min + " минут " + sec + " секунд");

        int w = d*7;
        int week = s/w;

        System.out.println(week + " недель " + day + " дней " + h + " часов " + min + " минут " + sec + " секунд");



    }

}
