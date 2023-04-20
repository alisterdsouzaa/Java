package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        var iResult = findFactorial(n);
        System.out.println(iResult);
    }

    static int findFactorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int factOfnMinus1 = findFactorial(n -1);
        int factorialOfn = n * factOfnMinus1;
        return  factorialOfn;
    }
}
