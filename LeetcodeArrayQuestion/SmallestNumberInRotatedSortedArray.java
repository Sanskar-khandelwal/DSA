package LeetcodeArrayQuestion;

public class SmallestNumberInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,9,1,2,3};
      int ans =   binarySearch(nums);
        System.out.println(ans);
    }

    private static int binarySearch(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int N = nums.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int prev = (mid - 1 + N) % N;
            int next = (mid + 1) % N;


        if(nums[mid] < nums[prev] & nums[mid] < nums[next]){
            return mid;
        }
        else if (nums[end] > nums[mid]){
            end = mid -1;
        }
        else if(nums[start] < nums[mid])
            start = mid +1;

        }
        return -1;
    }
}
