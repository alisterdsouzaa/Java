/**********************************************************************
 *
 * Problem Statement : Check if entered string is Palindrome or not
 *
 **********************************************************************/

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your string :");
        System.out.println();
        String stringOriginal = input.nextLine();

        // making copy of original string
        String temp = stringOriginal;

        String reverse = "";
        int strLen = stringOriginal.length();

        for(int i = strLen - 1; i>=0; i-- )
        {
            reverse = reverse + stringOriginal.charAt(i);
        }

        System.out.println("Reversed String is :"+reverse);

        if(temp.equals(reverse))
        {
            System.out.println("Entered String is a Palindrome String");
        }
        else
        {
            System.out.println("Not a Palindrome String");
        }
    }
}
