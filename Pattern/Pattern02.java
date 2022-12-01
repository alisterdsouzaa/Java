//////////////////////////////////////////////////////////////////////
// Problem Statement 1: Accept number from user and display pattern.
////////////////////////////////////////////////////////////////////////

// ip = 5
// op = A B C D E
package Pattern;
import java.util.Scanner;

public class Pattern02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide value : ");
        int iValue = input.nextInt();

         logicX(iValue);
    }

    public static void logicX(int iNo)
    {
        int iCnt;
        char ch;
        for ( iCnt =1,ch = 'A'; iCnt<=iNo; ch++,iCnt++)
        {
            System.out.print(ch+" ");
        }
    }
}

