// Reverse number using StringBuffer & Method.
package ReverseNum;

import java.util.Scanner;

public class ReverseNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number :");
        int iValue = input.nextInt();  //1234

        StringBuffer sb = new StringBuffer(String.valueOf(iValue));
        StringBuffer reverse = sb.reverse();

        System.out.println("Reversed Number is : "+reverse);
    }
}
