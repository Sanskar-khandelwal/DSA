package Practice;

class lc1356op {
    public static void main(String[] args) {
        int[][] arr = {{3,-1,-3,-3,-3},{2,-2,-3,-3,-3},{1,-2,-3,-3,-3},{0,-3,-3,-3,-3}};
   countNegatives(arr);
    }
    //Function to find a continuous sub-array which adds up to a given number.

    public static void countNegatives(int[][] grid) {
        int r = 0;
        int c = grid[0].length - 1;
        int n = grid[0].length;
        int negative = 0;
        int k;

//        for (int i = 0; i < grid.length; i++) {
         k = BS(grid[3], 0, grid[3].length -1);
         if(k != -1){
             negative = negative +n- k ;
//         }

        }
        System.out.println(negative);
      }

    public static int BS(int[] nums, int s, int e) {
        int mid = s + (e - s) / 2;
        if(s > e){
            return -1;
        }
        if(mid == 0 && nums[mid]< 0){
            return mid;
        }

        if (nums[mid] < 0 && nums[mid - 1] >= 0) {
            return mid;
        }
        else if(nums[mid] >= 0){
          return  BS(nums, mid + 1, e);
        }
        else if(nums[mid] < 0){
         return   BS(nums, s , mid -1);
        }
    return -1;
    }

}