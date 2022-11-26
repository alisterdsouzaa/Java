/************************************************************************************

 Problem Statement : Search in Array for the Target element. (Linear Search Algorithm)

 ***********************************************************************************/
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int arraySize = input.nextInt();

        int[] Arr = new int[arraySize];

        for (int i = 0; i< Arr.length; i++){
            System.out.println("Enter Array element number "+(i+1)+": ");
            Arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(Arr));

        System.out.println("Enter target element to search : ");
        int target = input.nextInt();

        for (int j = 0; j< Arr.length; j++)
        {
            if(Arr[j]==target){
                int index = j;
                System.out.println("Target element is at Array index : "+index);
                return;
            }
        }
            System.out.println("Target element is not present is Array");
    }
}
