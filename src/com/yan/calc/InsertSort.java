package com.yan.calc;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] array = {5,2,8,1,7,4,6,9,3};
        insertSort(array);
    }

    // ≤Â»Î≈≈–Ú
    public static void insertSort(int[] args){
        System.out.println("≈≈–Ú«∞£∫"+ Arrays.toString(args));
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
                System.out.println("≈≈–Ú÷–£∫[i="+i+"] "+Arrays.toString(args));
            }
        }
        System.out.println("---------------------->");
        System.out.println("≈≈–Ú∫Û£∫"+ Arrays.toString(args));
    }
}
