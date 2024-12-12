public class Main {
    public static void main(String[] args) {

        System.out.println("Task№1");
        enter();
        int year = 2000;
        System.out.println(calculateLeapYear(year));
        printSeparator();
        enter();

        System.out.println("Task№2");
        enter();
        int os = 0;
        int currentYear = 2014;
//        int currentYear = LocalDate.now().getYear();
        System.out.println(clientDeviceYear(os, currentYear));
        printSeparator();
        enter();

        System.out.println("Task№3");
        enter();

        int days = deliveryDistance(90);
        if (days == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется: " + days + (days == 1 ? " день" : " дня"));
            printSeparator();
        }
    }

    public static String calculateLeapYear(int year) {
        if (year < 1584 || (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            return year + " год является високосным";
        } else return year + " год не является високосным";
    }

    public static void enter() {
        System.out.println();
    }

    public static void printSeparator() {
        System.out.println("_______________");
    }


    public static String clientDeviceYear(int os, int currentYear) {
        if (os == 0 && currentYear <= 2015) {
            System.out.println("Установите блегченную версию приложения для iOS по ссылке");
        } else if (os == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (os == 1 && currentYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        return "";
    }

    public static int deliveryDistance(int km) {
        if (km < 20) {
            return 1;
        } else if (km > 20 && km < 60) {
            return 2;
        } else if (km > 60 && km <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
}