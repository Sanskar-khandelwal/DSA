package Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.
        int[] nums = {1,2,3,7, 4,0};
     int n =    mountainArray(nums);
        System.out.println(n);
    }

    private static int mountainArray(int[] nums) {
        int s = 0;
        int e = nums.length -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid-1] < nums[mid] && nums[mid] < nums[mid+1]){
            s = mid + 1;
            }
            else if(nums[mid -1] < nums[mid] && nums[mid] > nums[mid+1]){
                e = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
}
