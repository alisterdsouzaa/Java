///////////////////////////////////////////////////////////////
// Problem Statement 12 : Display pattern
///////////////////////////////////////////////////////////////
/*

A A A A A A
B B B B B B
C C C C C C

*/
package com.Pattern;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Rows : ");
        int iRow = input.nextInt();

        System.out.print("Enter number of Column : ");
        int iColumn = input.nextInt();

        displayPattern(iRow,iColumn);

    }

    public static void displayPattern(int iRow, int iColumn)
    {
        char ch = 'A';
        for (int i = 1; i<=iRow;ch++, i++ ) {
            for (int j = 1; j<=iColumn; j++)
            {
                System.out.print(ch+"\t");
            }
            System.out.println();
        }
    }
}
