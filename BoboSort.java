package com.company.suanfaday1;

import java.util.Arrays;

/**
 * @Auther: zhuzheng
 * @Date: 2020/7/16 - 07 - 16 - 15:16
 * @Description: sort
 * @version: 1.0
 */
public class BoboSort {
    /**
     * 自动生成随机数组
     *
     * @param maxValue
     * @param legth
     * @return
     */
    public static int[] creatArray(int maxValue, int legth) {
        int[] arr = new int[legth];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (maxValue * Math.random());
        }


        return arr;

    }

    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    /**
     * 冒泡排序
     *
     * @param arr
     * @return
     */
    public static int[] bobo(int[] arr) {
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                //进行位置互换
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }


            }
        }
        return arr;
    }

    public static boolean BinarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        int mid =0;
        while (left < right) {
            mid = right - ((right - left) >> 1);
            if (arr[mid] == value) {
                System.out.println("找到了中间");
                return true;

            } else if (arr[mid] < value) {
                left = mid + 1;
            } else if (arr[mid] > value) {
                right = mid - 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] ints = creatArray(99, 10);
        System.out.println(Arrays.toString(ints));
        int[] bobo = bobo(ints);
        System.out.println(Arrays.toString(bobo));
        boolean b = BinarySearch(bobo, 57);
        System.out.println(b);
    }
}
