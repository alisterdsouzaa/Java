/////////////////////////////////////////////////////////////////////////
// Problem Statement 0 : Accept number from user and display pattern.
////////////////////////////////////////////////////////////////////////
package com.Pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int iValue = input.nextInt();

        for(int i =1; i<iValue; i++ )
        {
            System.out.print(i +" ");
        }
    }
}
