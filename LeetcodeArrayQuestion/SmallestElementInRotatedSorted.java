package LeetcodeArrayQuestion;

class SmallestElementInRotatedSorted {

    public static void main(String[] args) {
       int ans = findMin(new int[ ]{3,4,5,1,2});
        System.out.println(ans);
    }



    public static  int findMin(int[] nums) {
       int ans =  SmallestElement( nums, 0, nums.length -1 );
        return ans;
    }
    
   public static   int SmallestElement(int[] nums, int start, int end) {
        int N = nums.length;
        while (start <= end ){
            int mid = start + (end - start)/2;
            int next =(mid + 1)% N;
            int prev = (mid - 1 + N) % N;
            if(nums[mid] < nums[next]   && nums[mid] < nums[prev]) {
                System.out.println(mid);
                return mid;

            }
           else if (nums[end] > nums[mid]) {
                end = mid - 1;
            }
               else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
    
    
    
    
    
    
    
    
    
