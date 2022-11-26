/////////////////////////////////////////////////////////////////////////
// Triangle Pattern 20 : Accept num of row and column and display pattern
/////////////////////////////////////////////////////////////////////////
// Input
// ie) Row 6 Column 5.

/*

 *       *       *       *       *
 *       @       @       @       *
 *       @       @       @       *
 *       @       @       @       *
 *       @       @       @       *
 *       *       *       *       *

 */
package com.Pattern;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Row : ");
        int iRow = input.nextInt();
        System.out.println("Enter Column :");
        int iColumn = input.nextInt();

        displayPattern(iRow, iColumn);
    }

    public static void displayPattern(int iRow, int iColumn){
        for (int i = 1; i<=iRow; i++){
            for (int j = 1; j<=iColumn; j++){
                if(i==1 || j ==1 || i == iRow || j==iColumn){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("@\t");
                }
            }
            System.out.println();
        }
    }
}

