// Swap 2 numbers in a Single Statement.
import java.util.Scanner;

public class SwapNumber3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1 ");
        int Num1 = input.nextInt();
        if(Num1 == 0)
        {
            System.out.println("Entered Num1 is 0.");
            System.out.println("Program terminated");
            System.exit(-1);
        }

        System.out.println("Enter number 2 ");
        int Num2 = input.nextInt();
        if(Num2==0)
        {
            System.out.println("Entered Num2 is 0.");
            System.out.println("Program terminated");
            System.exit(-1);
        }

        System.out.println("Number 1 is : "+Num1);
        System.out.println("Number 2 is : "+Num2);
        Num2 = Num1 + Num2 - (Num1 = Num2);  // Logic to swap in one expression.

        System.out.println("Swapped Numbers are "+Num1+"  "+Num2);

    }
}
