/**
 *  Selection Sort in Java.
 * =======================================================
 * File Path     : SelectionSort.java
 * Author        : Alister D'Souza
 * Date          : 19/04/2023
 *
 */
package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Array Size from user
        System.out.println("Please enter your array size : ");
        int arraySize = input.nextInt();
        int[] Arr = new int[arraySize];

        for (int k = 0; k< Arr.length; k++) {
            System.out.println("Enter Array Element number "+(k+1)+" "+":");
            Arr[k] = input.nextInt();
        }

        System.out.println("Your Array is :"+(Arrays.toString(Arr)));

        selectionSort(Arr);
        System.out.println("Array After  Selection Sorting is :");
        System.out.println(Arrays.toString(Arr));
    }

    static void selectionSort(int[] arr){

        for (int i = 0; i<arr.length-1; i++){
            int smallestElement = i;
            for (int j =i+1;j<arr.length; j++){
                if(arr[smallestElement]>arr[j]){
                    smallestElement = j;
                }
            }
            int temp = arr[smallestElement];
            arr[smallestElement] = arr[i];
            arr[i] = temp;
        }
    }
}
