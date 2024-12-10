public class Main {
    public static String calculateLeapYear(int year) {
        if (year < 1584) {
            System.out.println(" Год должен быть больше чем 1584. ");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year + " год является високосным";
        } else return year + " год не является високосным";
        return "";
    }

    public static void enter() {
        System.out.println();
    }

    public static void printSeparator() {
        System.out.println("_______________");
    }


    public static String clientDeviceYearIos(int os, int currentYear) {
        if (os == 0 || currentYear <= 2015) {
            return " Установите облегченную версию приложения для iOS по ссылке";
        } else {
            return "Установите версию приложения для IOS по ссылке";
        }
    }

    public static String clientDeviceYearAndroid(int os, int currentYear) {
        if (os == 1 || currentYear <= 2015) {
            return " Установите облегченную версию приложения для Android по ссылке";
        } else {
            return "Установите версию приложения для Android по ссылке";
        }
    }

    public static String deliveryDistance(int km) {
        if (km < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (km > 20 && km < 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (km > 60 && km < 100) {
            System.out.println("Потребуется дней: " + 3);
        } else System.out.println("Доставки нет");
        return "";
    }

    public static void main(String[] args) {

        System.out.println("Task№1");
        enter();
        int year = 1500;
        System.out.println(calculateLeapYear(year));
        printSeparator();
        enter();

        System.out.println("Task№2");
        enter();
        int os = 0;
        int currentYear = 2020;
//        int currentYear = LocalDate.now().getYear();
        if (os == 1) {
            System.out.println(clientDeviceYearIos(os, currentYear));
        } else {
            System.out.println(clientDeviceYearAndroid(os, currentYear));
        }
        printSeparator();
        enter();

        System.out.println("Task№3");
        enter();
        int km = 90;
        System.out.println(deliveryDistance(km));
        printSeparator();
    }
}