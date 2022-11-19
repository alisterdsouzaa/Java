// How to reverse a string in java?
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) throws  ArrayIndexOutOfBoundsException{
        System.out.println("Please Enter String to Reverse :");
        Scanner input = new Scanner(System.in);

        String stringToReverse = input.nextLine();

        ReverseString obj = new ReverseString();
        obj.stringReverse(stringToReverse);

    }

    private void stringReverse(String stringToReverse)
    {
        char[] reversedString = new char[stringToReverse.length()];
        char[] stringArray = stringToReverse.toCharArray();
        for (int iCnt = stringArray.length -1,j = 0; iCnt>=0; j++,iCnt--) {
            reversedString[j] = stringArray[iCnt];
        }

        System.out.println(reversedString);

    }
}

