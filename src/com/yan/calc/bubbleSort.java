package com.yan.calc;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int[] array = {5,2,8,1,7,4,6,9,3};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] arrays){
        System.out.println("排序前："+ Arrays.toString(arrays));
        int size = arrays.length;
        // 循环 size 次
        for (int i = 1; i < size; i++) {
            // 每次将前后较大的数下沉
            for (int j = 0; j < size-1; j++) {
                if (arrays[j] > arrays[j+1]){
                    int temp = arrays[j+1];
                    arrays[j+1] = arrays[j];
                    arrays[j] = temp;
                }
            }
            System.out.println("排序中："+Arrays.toString(arrays));
        }

        System.out.println("排序后："+ Arrays.toString(arrays));
    }
}
