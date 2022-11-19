// Reverse Number
// Using some Algorithm.

package ReverseNum;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number to reverse :");
        int iValue = input.nextInt();

        int temp = 0;

        while (iValue!=0)
        {
          temp = temp * 10;
          temp = temp + iValue % 10;
          iValue = iValue / 10;
        }

        System.out.println(temp);

    }
}
