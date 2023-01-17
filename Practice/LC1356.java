package Practice;

class LC1356
{
    public static void main(String[] args) {
        int[][] arr = {{4,3,2,-1},{3,2,1,-1},{1,-1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(arr));
    }
    //Function to find a continuous sub-array which adds up to a given number.

        public static int countNegatives(int[][] grid) {
            int r = 0;
            int c = grid[0].length -1;
            int n = grid.length -1;
            int negative = 0;
            int k;

            while(r <= n  && c >= 0 ){
                if(grid[r][c] > 0){
                    r++;
                }
                if(grid[r][c] < 0){
                    c--;
                    negative+= n -r + 1;

                }
            }
            return negative;
        }
    }
