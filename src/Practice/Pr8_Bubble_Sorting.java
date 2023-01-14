package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pr8_Bubble_Sorting {
    public static void main(String[] args) {
        int[] mass = {12, 11, 10, 9, 5, 22, 19, 2};
        int bus;
        boolean isSorted = false;

        while (!isSorted) {                                // "!isSorted" - "не false"
            isSorted = true;


            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] < mass[i + 1]) {
                    isSorted = false;                       //Цикл работает, пока флаг isSorted в значении false

                    bus = mass[i];
                    mass[i] = mass[i + 1];                  //если 2-ой элемент больше первого - переставялем его на место 1-ого
                    mass[i + 1] = bus;                      // 1-ый элемент переставляем на место 2-ого
                }
            }
        }
        System.out.println(Arrays.toString(mass));

    }
}
