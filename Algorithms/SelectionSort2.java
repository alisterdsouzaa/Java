package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter you array size :");
        int arraySize = input.nextInt();
        int[] arr = new int[arraySize];

        for (int k = 0; k < arr.length; k++){
            System.out.println("Enter array element number "+(k+1)+" :");
            arr[k] = input.nextInt();
        }

        System.out.println("Your entered array is : "+(Arrays.toString(arr)));

        selectionSort2(arr);
        System.out.print("Array after sorting is : ");
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int maxElement = getMaxElement(arr,0, last);

            sortArray(arr, maxElement, last);
        }
    }

    private static void sortArray(int[] arr, int maxElement, int last) {
        int temp = arr[last];
        arr[last] = arr[maxElement];
        arr[maxElement] = temp;
    }

    private static int getMaxElement(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last ; i++) {
            if (arr[max] < arr[i]){
                    max = i;
            }
        }
        return max;
    }
}
