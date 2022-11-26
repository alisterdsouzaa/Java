/*

$       *       *       *       *
*       $       *       *       *
*       *       $       *       *
*       *       *       $       *
*       *       *       *       $

*/
package com.Pattern;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Rows : ");
        int iRow = input.nextInt();

        System.out.print("Enter number of Column : ");
        int iColumn = input.nextInt();

        if(iRow != iColumn){
            System.out.println("Rows & Columns must be equal for this Pattern! \nInvalid Input");
            System.exit(-1);
        }

        displayPattern(iRow,iColumn);

    }

    public static void displayPattern(int iRow, int iColumn) {
        for (int i = 1; i<=iRow; i++){
            for(int j = 1; j<=iColumn; j++){
                if(i!=j){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("$\t");
                }
            }
            System.out.println();
        }

    }

}

