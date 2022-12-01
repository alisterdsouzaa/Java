/*
  Counts the total number of digits entered by user in the number.
 */
package Java;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.println("Enter number :");
            int iNo = input.nextInt();

            int iResult = countDigits(iNo);
            System.out.println(iResult);
        }

        private static int countDigits(int iNo){
            int iAdd = 0;
            while (iNo!= 0){
                iNo = iNo/10;
                iAdd++;
            }
            return iAdd;

        }

    }
