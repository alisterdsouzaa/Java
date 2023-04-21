
package Algorithms;
public class MergeSort {
    public static void conquer(int[] arr, int startingIndex , int midOfArray , int endingIndex){
        int[] mergedArray = new  int[endingIndex -startingIndex + 1];
        int index1 = startingIndex; //To track first array
        int index2 = midOfArray+1; //To track second Array
        int x =0;                  // To track merged array

        while (index1<=midOfArray && index2<=endingIndex){
            if(arr[index1]<= arr[index2]){
                mergedArray[x++] = arr[index1++];
              //  x++;
              //  index1++;
            }else {
                mergedArray[x++] = arr[index2++];
               // x++;index2++;
            }
        }

        while (index1<=midOfArray){
            mergedArray[x++] = arr[index1++];
           // x++; index1++;
        }

        while (index2<= endingIndex){
            mergedArray[x++] = arr[index2++];
          //  x++; index2++;
        }
        // loop to copy sorted array from mergedArray -> original array.
        for (int i = 0, j = startingIndex; i<mergedArray.length;j++, i++){
            arr[j] = mergedArray[i];
        }
    }

    /** Method to divide the array until it is sorted to single element. */
    public static void divide(int[] arr, int startingIndex, int endingIndex){
        if(startingIndex >= endingIndex){
            return;
        }
        int midOfArray = startingIndex + (endingIndex - startingIndex)/2;
        divide(arr,startingIndex, midOfArray);
        divide(arr,midOfArray+1,endingIndex);
        conquer(arr,startingIndex,midOfArray,endingIndex);


    }

    /* main routine */
    public static void main(String[] args) {
        int[] arr = {6,8,9,5,2,8};
        int n = arr.length;

        divide(arr,0, n-1);

        for (int element : arr) {
            System.out.print(element + " ");
        }


    }
}
