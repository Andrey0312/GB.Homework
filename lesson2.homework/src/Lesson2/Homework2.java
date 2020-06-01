package Lesson2;

import java.util.Arrays;

public class Homework2 {

    /* 1. Задать целочисленный массив,
    состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void main(String[] args) {

    }
    public static void intArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Решение_1: ");
        System.out.print(Arrays.toString(arr));
        System.out.print(" - ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));





    }
}
