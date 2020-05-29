package Homework;

public class Homework {

    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = .1f;
        double d = .12;
        char c = 123;
        boolean bo = true;
        String str = "home";

        System.out.println(calc(1, 2, 3, 4));

        System.out.println(isInRange(10, 1));

        int valueForCheck = 10;
        checkValue(valueForCheck);

        System.out.println(isNegative(-10));

        String name = "Andrey";
        greetings(name);

        int year = 2004;
        System.out.println("Year" + " " + year + " " + "is" + " " + (isLeapYear(year) ? "leap" : "not leap"));
    }

    /* 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий
    результат,где a, b, c, d – входные параметры этого метода;
     */
    public static int calc(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    /* 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма
    лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
     */
    public static boolean isInRange(int firstValue, int secondValue) {
        int sum = firstValue + secondValue;
        return 10 <= sum && sum <= 20;
    }

    /* 5. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    Замечание: ноль считаем положительным числом.
     */
    public static void checkValue(int value) {
        if (value >= 0) {
            System.out.println(value + " " + "is positive");
        } else {
            System.out.println(value + "is negative");
        }
    }

    /* 6. Написать метод, которому в качестве параметра передается целое число,
    метод должен вернуть true, если число отрицательное;
     */
    public static boolean isNegative(int value) {
        return value < 0;
    }
    /* 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
     */
    public static void greetings(String name) {
        System.out.println("Привет" + " " + name + "!");
    }
    /* 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static boolean isLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 !=0)) || (year % 400 ==0);
    }
}



