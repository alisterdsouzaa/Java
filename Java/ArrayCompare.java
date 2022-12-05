/**
 Problem Statement : Compare two Arrays.
* */

package Java;

public class ArrayCompare {
    public static void main(String[] args) {
        int[] Arr1 = {1,2,3,4,5};
        int[] Arr2 = {1,2,3,4,5};

        boolean Result = arrayCmp(Arr1,Arr2);
        if(Result) {
            System.out.println("Array's are identical");
        }
        else {
            System.out.println("Array's are NOT identical");
        }

    }

    private static boolean arrayCmp(int[] arr1,int[] arr2 ){
        boolean flag = false;
        if(arr1.length == arr2.length){
            for (int i = 0; i< arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    flag = true;
                } else {
                    return false;
                }
            }
        }
        return flag;
    }
}
