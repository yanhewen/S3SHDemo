package com.yan.calc;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int[] array = {5,2,8,1,7,4,6,9,3};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] arrays){
        System.out.println("����ǰ��"+ Arrays.toString(arrays));
        int size = arrays.length;
        // ѭ�� size ��
        for (int i = 1; i < size; i++) {
            // ÿ�ν�ǰ��ϴ�����³�
            for (int j = 0; j < size-1; j++) {
                if (arrays[j] > arrays[j+1]){
                    int temp = arrays[j+1];
                    arrays[j+1] = arrays[j];
                    arrays[j] = temp;
                }
            }
            System.out.println("�����У�"+Arrays.toString(arrays));
        }

        System.out.println("�����"+ Arrays.toString(arrays));
    }
}
