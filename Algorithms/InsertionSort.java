package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter you array size :");
        int arraySize = input.nextInt();
        int[] arr = new int[arraySize];

        for (int k = 0; k < arr.length; k++){
            System.out.println("Enter array element numbers : "+(k+1)+" :");
            arr[k] = input.nextInt();
        }

        System.out.println("Your entered array is : "+(Arrays.toString(arr)));

        insertionSort(arr);
        System.out.println("Array after sorting is :"+ Arrays.toString(arr));
    }

    private static void swapArray(int[] arr, int maxElement, int last) {
        int temp = arr[last];
        arr[last] = arr[maxElement];
        arr[maxElement] = temp;
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j -1]){
                    swapArray(arr,j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }

}
