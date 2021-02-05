//Начав тренировки, спортсмен в первый день пробежал 10 км.
//        Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
//        Какой суммарный путь пробежит спортсмен за 7 дней?


public class HomeworkOne {

    public static void main(String[] args) {

        double distance = 10;
        double sum = 0;
        double km = 10;
        for (int i = 1; i < 7; i++) {

            distance *=1.1;
            sum =km+=distance;
        }
       System.out.println("За 7 дней спортсмен пробежит " + (int)distance + " км");

    }
}
