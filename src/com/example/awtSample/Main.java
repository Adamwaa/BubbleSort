package com.example.awtSample;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {




        Integer[] intArray = {43, -5, 113, 56, 3, 13, 965, -54, 0, 432,-2, 33};
        BubbleSort<Integer> bubbleSort1 = new BubbleSort<Integer>(intArray);
        Integer[] integerSort = bubbleSort1.bubbleSort();
        System.out.println("Sorted Array: " + Arrays.toString(integerSort));

            String[] strArr = {"John", "Adam", "Paulina", "Abc", "Karl", "Hanna"};
            BubbleSort<String> bubbleSort2 = new BubbleSort<String>(strArr);
            String[] stringSort = bubbleSort2.bubbleSort();
            System.out.println("Sorted Array: " + Arrays.toString(stringSort));
    }
}
