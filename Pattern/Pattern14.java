//////////////////////////////////////////////////////////////
// Problem Statement 14 : Display pattern
///////////////////////////////////////////////////////////////

/*

1 2 3 4
5 6 7 8
9 10 11 12

*/
package com.Pattern;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Rows : ");
        int iRow = input.nextInt();

        System.out.print("Enter number of Column : ");
        int iColumn = input.nextInt();

        displayPattern(iRow,iColumn);

    }

    public static void displayPattern(int iRow, int iColumn) {
        int k = 1;
        for(int i = 1; i<=iRow; i++){
            for (int j = 1; j<=iColumn;k++, j++){
                System.out.print(k+"\t");
            }
            System.out.println();
        }
    }

}
