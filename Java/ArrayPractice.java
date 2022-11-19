package com.Java;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = new String[5];

       for(int i=0; i< str.length; i++)
       {
           str[i] = input.nextLine();
           System.out.println("Element are : "+str[i]);
       }

        System.out.println(Arrays.toString(str));

    }
}
