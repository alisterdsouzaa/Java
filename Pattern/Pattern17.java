/////////////////////////////////////////////////////////////////////////
// Triangle Pattern 17 : Accept num of row and column and display pattern
/////////////////////////////////////////////////////////////////////////
// Input
// ie) Row 4 Column 4.

/*

 *  *  *  *
 *  *  *  #
 *  *  #  #
 *  #  #  #

 */
package com.Pattern;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Rows : ");
        int iRow = input.nextInt();

        System.out.print("Enter number of Column : ");
        int iColumn = input.nextInt();

        displayPattern(iRow,iColumn);

    }

    public static void displayPattern(int iRow, int iColumn) {
        for (int i = iRow; i>=1; i--){
            for(int j = 1; j<=iColumn; j++){
                if(i>=j){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }

    }

}

