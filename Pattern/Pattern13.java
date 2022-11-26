//////////////////////////////////////////////////////////////
// Problem Statement 13 : Display pattern
///////////////////////////////////////////////////////////////

/*

4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1

*/

package com.Pattern;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Rows : ");
        int iRow = input.nextInt();

        System.out.print("Enter number of Column : ");
        int iColumn = input.nextInt();

        displayPattern(iRow,iColumn);

    }

    public static void displayPattern(int iRow, int iColumn) {
        for(int i =iRow; i>=1; i--){
            for (int j = 1; j<=iColumn; j++){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }

}
