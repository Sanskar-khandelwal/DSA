package Practice;

import java.util.Arrays;

public class MergeSortRec {
    public static void main(String[] args) {
        int[] nums = {8,1,5,2,6,7,3,9};
        System.out.println(Arrays.toString(mergeSort(nums)));
    }

    private static int[] mergeSort(int[] nums) {

        if(nums.length == 1){
            return nums;
        }

        int mid = nums.length/2;
        int [] left = mergeSort(Arrays.copyOfRange(nums, 0 , mid));
        int [] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length ));
      int[] ans =   merge(left, right);
      return ans;
    }

    private static int[] merge(int[] left, int[] right) {
        int [] nums = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                nums[k] = left[i];
                i++;
                k++;
            }
            else{
                nums[k] = right[j];
                k++;
                j++;
            }
        }
        while(i < left.length){
            nums[k] = left[i];
            k++;
            i++;
        }
        while(j < right.length){
            nums[k]   = right[j];
            k++;
            j++;
        }
  return nums;
    }


}
