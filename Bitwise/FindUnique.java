/*
 *   Find the unique number from the array which is not repeat using Bitwise Operators
 * =======================================================
 * File Path     : FindUnique.java
 * Author        : Alister D'Souza
 * Date          : 11/04/2023
 *
 */

package Bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int arr [] = {2,3,3,4,2,6,4};
        int Result = uniqueNumber(arr);
        System.out.println("Unique number in the give array is : "+Result);
    }

    private static int uniqueNumber(int arr[]){
        int unique =0;
            for (int n: arr){
                unique = unique ^ n;
            }
        return unique;
    }
}
