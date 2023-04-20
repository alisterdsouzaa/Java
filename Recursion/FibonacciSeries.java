/**
 *    Fibonacci numbers using recursion.
 * =============================================
 * File Path     : Fibonacci.java
 * Author        : Alister D'Souza
 * Date          : 20/04/2023
 *
 */
package Recursion;

import java.util.Scanner;

public class FibonacciSeries {

    protected static void fibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print("->"+c);
        fibonacci(b,c, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        int a = 0, b = 1;
        // n-2 because first 2 number from series we have.
        fibonacci(a,b,n-2);
    }
}
