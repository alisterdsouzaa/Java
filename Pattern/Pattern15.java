//////////////////////////////////////////////////////////////
// Problem Statement 15 : Display pattern
///////////////////////////////////////////////////////////////

/*

 1  2  3  4  5
-1 -2 -3 -4 -5
 1  2  3  4  5
-1 -2 -3 -4 -5

*/
package com.Pattern;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Rows : ");
        int iRow = input.nextInt();

        System.out.print("Enter number of Column : ");
        int iColumn = input.nextInt();

        displayPattern(iRow,iColumn);

    }

    public static void displayPattern(int iRow, int iColumn) {
       for (int i = 1; i<=iRow; i++){
           int k = 1;
           for(int j = 1; j<=iColumn; j++){
               if(i%2 != 0){
                   System.out.print(k++ +"\t");
               }
               else {
                   System.out.print((k++)*(-1)+"\t");
               }
           }
           System.out.println();
       }
    }

}
