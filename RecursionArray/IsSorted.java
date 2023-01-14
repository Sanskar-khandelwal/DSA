//package RecursionArray;
//
//public class IsSorted {
//
//    public static void main(String[] args) {
//        int[] nums = {1,16,30, 32, 40};
//
//        boolean ans = isSorted(nums, 0);
//        System.out.println(ans);
//
//
//    }
//
//    public static boolean isSorted(int[] nums, int index) {
//
//
//        // Naive linear Search Approach but we want to do it with recursion
////        for (int i = 1; i < nums.length; i++) {
////
////            if (nums[i] < nums[i - 1]){
////                {
////                    return false;
////                }
////            }
////        }
////    return true;
////    }
//        if (index == nums.length - 1) {
//            return true;
//        }
//        return nums[index] < nums[index + 1] & isSorted(nums, index+ 1);
//    }
//}

package RecursionArray;

public class IsSorted {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3,  5,4 };
        boolean ans = isSortedOrNot(arr, 0, 1);
        System.out.println(ans);
    }

    public static boolean isSortedOrNot(int[] nums, int i, int j) {
        int n = nums.length;
        if (i == n -1) {
            return true;
        }
        if (nums[i] < nums[j]) {
            return isSortedOrNot(nums, i + 1, j + 1);
        }
        return false;

    }
}

