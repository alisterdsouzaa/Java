/*
    Problem Statement : Add each digit of the inputted number.
 */
package Java;
import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iNo = input.nextInt();

        int iResult = countDigits(iNo);
        System.out.println(iResult);

    }

    private static int countDigits(int iNo){
        int iAdd = 0;
        while (iNo!= 0){
            iAdd =iAdd + iNo%10;
            iNo = iNo/10;
        }
        return iAdd;

    }

}
