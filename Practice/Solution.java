package Practice;

class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int maxNum = 0;
        for(int i = 1; i < maxSum; i++){
           maxNum = maxNum + i;
           if(maxNum >= maxSum){
               break;
           }
        }
        if(index == n -1){
            return maxNum;
        }
        else{
            return maxNum -1;
        }
    }
}