/**********************************************************************

Problem Statement : Sort Array taken from user (Bubble Sort Algorithm)

**********************************************************************/

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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
        
        bubbleSort(Arr);
        System.out.println("Array After Sorting is :");
        System.out.println(Arrays.toString(Arr));
    }

    static  void bubbleSort(int[] arr)
    {
        for (int i =0; i< arr.length; i++) {
            for(int j=1; j< arr.length-i; j++) {
                // Swap if the item is smaller than previous item
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
    }

}
