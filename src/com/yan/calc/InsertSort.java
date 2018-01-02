package com.yan.calc;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] array = {5,2,8,1,7,4,6,9,3};
        insertSort(array);
    }

    // ��������
    public static void insertSort(int[] args){
        System.out.println("����ǰ��"+ Arrays.toString(args));
        System.out.println("---------------------->");
        for (int i = 1; i < args.length; i++) {
            int j;
            int temp = args[i];
            for (j = i-1; j >= 0; j--) {
                if (args[j]>temp){
                    args[j+1] = args[j];
                    args[j]=temp;
                }else{
                    break;
                }
                System.out.println("�����У�[i="+i+"] "+Arrays.toString(args));
            }
        }
        System.out.println("---------------------->");
        System.out.println("�����"+ Arrays.toString(args));
    }
}
