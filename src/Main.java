public class Main {
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

    }

    public static void task3() {

    }
}