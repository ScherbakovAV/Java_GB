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
        int i = new Random().nextInt(max_rand + 1);
        System.out.println("Случайное число в диапазоне от 0 до " + max_rand + ": " + i);

        System.out.println(i + " в двоичном виде: " + Integer.toBinaryString(i));

        int n = head_bit_find(i);
        System.out.println("Номер старшего значащего бита выпавшего числа: " + n);

        int[] m1 = multi_find(n, i, Short.MAX_VALUE, true);
        System.out.println("Кратные " + n + " числа в диапазоне от " + i + " до " + Short.MAX_VALUE + ":");
        arr_print(m1);

        int[] m2 = multi_find(n, Short.MIN_VALUE, i, false);
        System.out.println("Некратные " + n + " числа в диапазоне от " + Short.MIN_VALUE + " до " + i + ":");
        arr_print(m2);
    }
    private static int head_bit_find(int numb) {
        int count = 1;
        while (numb > 1) {
            numb >>= 1;
            count++;
        }
        return count;
    }
    private static int[] multi_find(int num, int start_num, int last_num, boolean isMult) {
        int len = 0;
        for (int j = start_num; j <= last_num; j++) {
            if (isMult) {
                if (j % num == 0) len++;
            }
            if (!isMult) {
                if (j % num != 0) len++;
            }
        }

        int[] arr = new int[len];

        int count = 0;
        for (int j = start_num; j <= last_num; j++) {
            if (isMult) {
                if (j % num == 0) {
                    arr[count] = j;
                    count++;
                }
            }
            if (!isMult) {
                if (j % num != 0) {
                    arr[count] = j;
                    count++;
                }
            }
        }
        return arr;
    }
    private static void arr_print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}