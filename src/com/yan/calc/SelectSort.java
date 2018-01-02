package com.yan.calc;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {5,13,2,8,1,7,4,6,9,3};
        selectSort(array);
    }

    // ѡ������
    public static void selectSort(int[] args){
        System.out.println("����ǰ��"+ Arrays.toString(args));
        System.out.println("---------------------->");
        for (int i = 0; i < args.length; i++) {
            int min = args[i];
            int minIndex = i;
            for (int j = i+1; j < args.length; j++) {
                if (args[j] <min){
                    min = args[j];
                    minIndex = j;
                }
            }

            args[minIndex] = args[i];
            args[i] = min;
            System.out.println("�����У�[i="+i+"] "+Arrays.toString(args));
        }

        System.out.println("---------------------->");
        System.out.println("�����"+ Arrays.toString(args));
    }
}
