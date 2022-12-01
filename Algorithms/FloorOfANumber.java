/**
 * Problem Statement : Find Floor of the number (target element).
 */

// Floor of a number is the greatest number  <= to target
package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class FloorOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of your Array : ");
        int arrSize = input.nextInt();

        int[] Arr = new int[arrSize];

        for (int i = 0; i< Arr.length; i++){
            System.out.println("Input array element number : "+(i+1));
            Arr[i] = input.nextInt();
        }
        // Sorting user input array
        Arrays.sort(Arr);
        System.out.print("Array after sorting is : "+ Arrays.toString(Arr));

        System.out.println();
        System.out.println("Please enter target array element to search : ");
        int target = input.nextInt();

        int iResult = FloorLogic(Arr, target);
        System.out.println("Element present a index number "+ iResult);
    }

    // Function performing Binary Search to find target element.
    static int FloorLogic(int[] arr, int target){
        int start = 0, end = arr.length -1;

        while (start<=end){
            int mid = start +(end -start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        // When while breaks, start = end + 1. ie) our Greatest num <= to target.
        return  end;
    }
}

