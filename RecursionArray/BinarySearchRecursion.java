package RecursionArray;

public class BinarySearchRecursion {


    public static void main(String[] args) {
        int[] nums = {1,16,30, 32, 40};
        int target = 0;
        int  ans = BinarySearch(nums, target, 0, nums.length -1);
        System.out.println(ans);
    }

  static int BinarySearch(int[] nums, int target, int start, int end ) {
        while(start <= end ){

            int mid  = start + (end - start)/2;

            if(target == nums[mid]){
                return mid;
            }
            if(target > nums[mid]){
              return  BinarySearch(nums, target, mid +1, end);
            }
            else return BinarySearch(nums, target, start, mid -1 );

        }
   return -1;
    }

}
