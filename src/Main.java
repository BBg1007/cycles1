public class Main {
    public static void main(String[] args) {

        //Task1
        System.out.println("Задача №1");
        System.out.println();
        for (byte i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        //Task2
        System.out.println("Задача №2");
        System.out.println();
        for (byte i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        //Task 3
        System.out.println("Задача №3");
        System.out.println();
        for (byte i = 0; i <= 17; i= (byte) (i+2)) {
            System.out.println(i);
        }
        System.out.println();

        //Task 4
        System.out.println("Задача №4");
        System.out.println();
        for (byte i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        //Task 5
        System.out.println("Задача №5");
        System.out.println();
        for (short i = 1904; i <= 2096; i = (short) (i + 4)) {
            System.out.println(i+" год является высокосным.");
        }
        System.out.println();

        //Task 6
        System.out.println("Задача №6");
        System.out.println();
        for (byte i = 7; i <= 98; i= (byte) (i+7)) {
            System.out.println(i);
        }
        System.out.println();

        //Task 7
        System.out.println("Задача №7");
        System.out.println();
        for (short i = 1; i <= 512; i = (short) (i * 2)) {
            System.out.println(i);
        }
        System.out.println();

        //Task 8
        System.out.println("Задача №8");
        System.out.println();
        int stash = 0;
        int cash = 29000;
        for (byte i = 1; i <= 12; i++) {
            stash = stash + cash;
            System.out.println("Месяц "+i+" сумма накоплений равна "+stash+" рублей");
        }
        System.out.println();

        //Task 9
        System.out.println("Задача №9");
        System.out.println();
        stash = 0;
        for (byte i = 1; i <= 12; i++) {
            stash = stash + stash / 100;
            stash = stash + cash;
            System.out.println("Месяц "+i+" сумма накоплений равна "+stash+" рублей");
        }
        System.out.println();

        //Task 10
        System.out.println("Задача №10");
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*"+i+"="+(i*2));
        }



    }
}