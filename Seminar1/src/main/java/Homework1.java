/*
1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
   Пункты реализовать в методе main
   *Пункты реализовать в разных методах
   int i = new Random().nextInt(k); //это кидалка случайных чисел!)*/

import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {
        int max_rand = 2000;
        int i = rand(max_rand);
        System.out.println("Случайное число в диапазоне от 0 до " + max_rand + ": " + i);

        String bin_i = Integer.toBinaryString(i);
        System.out.println(i + " в двоичном виде: " + bin_i);

        int n = head_bit_find(i);
        System.out.println("Номер старшего значащего бита выпавшего числа: " + n);

        int max = Short.MAX_VALUE;
        int min = Short.MIN_VALUE;

        int[] m1 = multi_find(n, i, max);
        System.out.println("Кратные " + n + " числа в диапазоне от " + i + " до " + max + ":");
        //arr_print(m1);

        int[] m2 = non_multi_find(n, min, i);
        System.out.println("Некратные " + n + " числа в диапазоне от " + min + " до " + i + ":");
        //arr_print(m2);
    }
    public static int rand(int max) {
        int rand_number = new Random().nextInt(max + 1);
        return rand_number;
    }
    public static int head_bit_find(int numb) {
        int count = 1;
        while (numb > 1) {
            numb >>= 1;
            count++;
        }
        return count;
    }
    public static int[] multi_find(int num, int start_num, int last_num) {
        int len = 0;
        for (int d = start_num; d <= last_num; d++) {
            if (d % num == 0) {
                len++;
            }
        }

        int[] arr1 = new int[len];

        int count = 0;
        for (int k = start_num; k <= last_num; k++) {
            if (k % num == 0) {
                arr1[count] = k;
                count++;
            }
        }
        return arr1;
    }
    public static int[] non_multi_find(int num, int start_num, int last_num) {
        int len = 0;
        for (int d = start_num; d <= last_num; d++) {
            if (d % num != 0) {
                len++;
            }
        }

        int[] arr2 = new int[len];

        int count = 0;
        for (int k = start_num; k <= last_num; k++) {
            if (k % num != 0) {
                arr2[count] = k;
                count++;
            }
        }
        return arr2;
    }
    public static void arr_print(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}
