package com.Java;

import java.util.Arrays;

public class NumsMethod {
    public static void main(String[] args) {
        int[] nums = {11, 23,13,1,2,3};

        System.out.println(Arrays.toString(nums));
         change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static  void change(int[] arr)
    {
        arr[0] = 99;
    }
}
