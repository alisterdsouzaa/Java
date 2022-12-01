//////////////////////////////////////////////////////////////////////
// Problem Statement 4: Accept number from user and display pattern.
////////////////////////////////////////////////////////////////////////

// ip = 4
// op = # 1 * # 2 * # 3 * # 4 * # 5 *

package Pattern;

import java.util.Scanner;

public class Pattern04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter input :");
        int iNo = input.nextInt();

        displayPattern(iNo);

    }

    public static void displayPattern(int iNo){
        for (int iCnt = 1; iCnt<=iNo; iCnt++){
            System.out.print("#\t"+iCnt+"\t*\t");
        }
    }
}
