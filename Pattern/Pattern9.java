/////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement 9 : Accept num from user of row and column and display pattern
/////////////////////////////////////////////////////////////////////////////////////////

/* Pattern to display

    Row =3 Column = 5

   5 4 3 2 1
   5 4 3 2 1
   5 4 3 2 1

*/
package com.Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern9 {
    public static void main(String[] args) throws IOException {
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader boj = new BufferedReader(obj);

        System.out.println("Please enter number of rows :");
        int iRow = Integer.parseInt(boj.readLine());
        System.out.println("Please enter number of columns :");
        int iColumn = Integer.parseInt(boj.readLine());

        displayPattern(iRow,iColumn);

    }

    private static void displayPattern(int iRow, int iColumn){
        for (int i = 1; i<=iRow; i++){
            for (int j = iColumn; j>=1; j--){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
