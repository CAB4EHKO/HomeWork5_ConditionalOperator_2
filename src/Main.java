public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1.");
        int clientOS = 1;
        String i = "Установите версию приложения для IOS по ссылке:";
        String a = "Установите версию приложения для Android по ссылке:";
        if (clientOS == 0) {
            System.out.println(i);
        }
        if (clientOS == 1) {
            System.out.println(a);
        }
    }
    public static void task2() {
        System.out.println("Задача 2.");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        String i = "Установите версию приложения для IOS по ссылке:";
        String a = "Установите версию приложения для Android по ссылке:";
        String oldI = "Установите облегчунную версию приложения для IOS по ссылке:";
        String oldA = "Установите облегчунную версию приложения для Android по ссылке:";
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println(oldI);
        } else if (clientOS == 0) {
            System.out.println(i);
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println(oldA);
        } else if (clientOS == 1) {
            System.out.println(a);
        }
    }
    public static void task3() {
        System.out.println("Задача 3.");
        int year = 1213;
        if (year % 4 != 0) {
            System.out.println(year + " год не високосный.");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " год не високосный.");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год високосный.");
        }
    }
    public static void task4() {
        System.out.println("Задача 4.");
        int deliveryDistance = 101;
        int daysOfDelivery = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Для доставки карты нам потребуется " + daysOfDelivery + " день.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            daysOfDelivery += 1;
            System.out.println("Для доставки карты нам потребуется " + daysOfDelivery + " дня.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daysOfDelivery += 2;
            System.out.println("Для доставки карты нам потребуется " + daysOfDelivery + " дня.");
        }
        else {
            System.out.println("Доставки нет.");
        }
    }
}