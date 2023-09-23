package DSA;
import java.util.HashMap;
// Given an array find max freq of element greater than n/3. Where n is the size of array.

public class HashMapQuestion_FindFrequency {

    public static void majorityElement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i <n ; i++) {
            if(map.containsKey(nums[i])){ // Checking if the key is already present in the hash map?
                map.put(nums[i],map.get(nums[i]) + 1 ); // if yes, update the value (frequency) in the hashmap.
            }else { // if key is not present in the hashmap add the key and set freq as 1.
                map.put(nums[i], 1);
            }
        }

        System.out.println(map.entrySet()); // Printing the hashmap.

        for (int key : map.keySet()){  // Iterating over the values in hashmap and checking if freq > n/3.
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,5,1,3,1,5,1};
        majorityElement(nums);

    }
}
