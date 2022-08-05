package LeetcodeArrayQuestion;

import java.util.Arrays;

class SmallerThanCurrentNumber {

    public static void main(String[] args) {
        int[] nums = {7,37,3,68,3,1,2};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
  static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        
        for(int i = 0; i < nums.length ; i++){
            int count = 0;
            for(int j = 0; j < nums.length ; j++){
                     if(nums[j] < nums[i]){
                        count ++;
                     }
                arr[i] = count;
            }
        }
        return arr;
    }
}