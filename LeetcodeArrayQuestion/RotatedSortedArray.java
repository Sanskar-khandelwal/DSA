package LeetcodeArrayQuestion;

class SmallestElementInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        search(nums,0);
    }


    public  static void search(int[] nums, int target) {
        int smallest = SmallestElement(nums, 0, nums.length - 1);
        System.out.println(smallest);
        if (smallest == target) {
            System.out.println(smallest);
        }
        int ans1 = BinarySearch(nums, 0, smallest - 1, target);
        int ans2 = BinarySearch(nums, smallest + 1, nums.length -1, target);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    public static int SmallestElement(int[] nums, int start, int end) {
        if (nums.length == 1) {
            return 0;
        }
        int N = nums.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % N;
            int prev = (mid - 1 + N) % N;
            if (nums[mid] < nums[next] && nums[mid] < nums[prev]) {

                return mid;

            } else if (nums[end] > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static int BinarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1;
    }
}