// Reverse Number using StringBuilder Method.
package ReverseNum;

import java.util.Scanner;

public class ReverseNumber1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number to Reverse : ");
        int iValue = input.nextInt();

        StringBuilder sb = new StringBuilder();
        sb.append(iValue);
        sb.reverse();

        System.out.println("Reversed Number is : "+sb);
    }
}
