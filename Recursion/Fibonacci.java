/*
    Problem Statement : Find Fibonacci Series on Nth Number
 */
package com.Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Nth term to find values of Fibonacci series : ");
        int iValue = input.nextInt();

        int iResult = fibo(iValue);
        System.out.println("Fibonacci Series of "+iValue+" is :"+iResult);
    }

    public static int fibo(int iNo){

        if(iNo<2){
            return  iNo;
        }
        return fibo(iNo-1)+fibo(iNo-2);
    }
}
