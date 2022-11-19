package com.Java;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Arr[] = new int[4];

        System.out.println("Please enter Elements of Array ");

        for (int iCnt =0; iCnt<Arr.length; iCnt++)
        {
            System.out.println("Element number "+iCnt);
            Arr[iCnt] = input.nextInt();
        }

        System.out.println("Entered elements are :");
        for (int iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            System.out.println("Elements are "+Arr[iCnt]);
        }

        input.close();
    }
}
