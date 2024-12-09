import java.time.LocalDate;

public class Main {
    public static String calculateLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year + " год является високосным";
        } else {
            return year + " год не является високосным";
        }
    }

    public static void enter() {
        System.out.println();
    }

    public static void printSeparator() {
        System.out.println("_______________");
    }

    public static String clientDeviceYear(int OS, int currentYear) {
        if (OS == 0) {
            if (currentYear <= 2015) {
                return " Установите облегченную версию приложения для iOS по ссылке";
            } else {
                return "Установите версию приложения для IOS по ссылке";
            }
        }
        if (OS == 1) {
            if (currentYear <= 2015) {
                return " Установите облегченную версию приложения для Android по ссылке";
            } else {
                return "Установите версию приложения для Android по ссылке";
            }
        }
        return "";
    }

    public static String deliveryDistance(int KM) {
        if (KM < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (KM > 20 && KM < 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (KM > 60 && KM < 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставки нет");
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println("Task№1");
        enter();
        int year = 2024;
        System.out.println(calculateLeapYear(year));
        printSeparator();
        enter();
        System.out.println("Task№2");
        enter();
        int OS = 1;
//        int currentYear = 2020;
        int currentYear = LocalDate.now().getYear();
        System.out.println(clientDeviceYear(OS, currentYear));
        enter();
        System.out.println("Task№3");
        enter();
        int KM = 110;
        System.out.println(deliveryDistance(KM));
    }
}