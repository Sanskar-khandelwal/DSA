package RecursionArray;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] nums = {1,16,30, 32, 40};
    int target = 40;
int  ans = LinearSearch(nums, target, 0);
        System.out.println(ans);


    }

     static int LinearSearch(int[] nums, int target , int i) {

        if(i == nums.length){
            return -1;
        }

        if(nums[i] == target){
            return i;
        }
      return   LinearSearch(nums, target,i+1);

    }
}
