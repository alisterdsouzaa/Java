// Swapping number without using 3rd Variable
import java.util.Scanner;

public class SawpNumber1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1 ");
        int iNum1 = input.nextInt();
        System.out.println("Enter Number 2 ");
        int iNum2 = input.nextInt();

        System.out.println("Number 1 & Number 2 are : "+iNum1+" "+iNum2);

        iNum1 = iNum1 + iNum2;
        iNum2 = iNum1 - iNum2;
        iNum1 = iNum1 - iNum2;

        System.out.println("Number after swapping without 3rd Variable are : "+iNum1+" "+iNum2);

    }
}
