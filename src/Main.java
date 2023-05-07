public class Main {
    public static void checkDelivery(int deliveryDistance, int deliveryTime) {
        if (deliveryDistance <= 20) {
        System.out.println("Потребуется дней: " + deliveryTime + " суток");
    } else if (deliveryDistance <= 60) {
        System.out.println("Потребуется дней: " + (deliveryTime + 1) + " суток");
    } else if (deliveryDistance <= 95) {
        System.out.println("Потребуется дней: " + (deliveryTime + 2) + " суток");
    } else {
            System.out.println("Доставки нет");
        }
    }
    public static void checkOs(int number, int year) {
        if (number == 0) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void checkYear(int year) {
        if ((year % 4) != 0) {
            System.out.println(year + " год не является високосным");
        } else if ((year % 400) == 0) {
            System.out.println(year + " год является високосным");
        } else if ((year % 100) == 0) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год является високосным");
        }

}
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        checkYear(2100);
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");
        checkOs(1, 2016);
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        checkDelivery(110, 1);
    }
}