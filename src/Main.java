public class Main {
    public static void main(String[] args) {
        task1();
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
}