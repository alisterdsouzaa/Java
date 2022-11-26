/////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement 8 : Accept num from user of row and column and display pattern
/////////////////////////////////////////////////////////////////////////////////////////

/* Pattern to display

    Row = 4  Column = 4

   1 1 1 1
   2 2 2 2
   3 3 3 3
   4 4 4 4

*/
package com.Pattern;

import java.util.Scanner;

public class Pattern8 {
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
        for (int i = 1; i<=iRow; i++ ) {
            for (int j = 1; j<=iColumn; j++)
            {
                System.out.print(i+"\t");
            }
            System.out.println();

        }
    }
}

