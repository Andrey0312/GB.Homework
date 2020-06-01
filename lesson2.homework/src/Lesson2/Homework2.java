package Lesson2;

import java.util.Arrays;

public class Homework2 {


    public static void main(String[] args) {
       intArray();
       valArray();
       multiplicationInsideAnArray();
       squareArray();

    }
    /* /* 1. Задать целочисленный массив,
    состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void intArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    /* 2. Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    public static void valArray() {
        int[] arr = new int[8];
        int j = 0;
        for(int i = 0; i < arr.length; i++, j = j + 3) {
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }
    /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void multiplicationInsideAnArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6 ) arr[i] = arr[i]*2;
        }
        System.out.println(Arrays.toString(arr));
    }
    /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    public static void squareArray() {
        int i, j;
        int [][] arr = new int [3][3];

        for (i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            for (j = arr.length; j < 0; j--) {
                arr[j][j] = 1;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr));

    }
    }
