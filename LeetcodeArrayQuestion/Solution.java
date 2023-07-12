package LeetcodeArrayQuestion;

import java.util.ArrayList;
class Solution {

    public static int factorial(int n ){
        int mul = 1;
        if(n == 0){
            return 1;
        }
        for(int i = n; i > 0; i--){
            mul = mul * i;
           
        }
        return mul;

    }
    public static ArrayList<Integer>  generateRow( int row,int  col){
        ArrayList<Integer> sublist = new ArrayList<>();
        for(int i = 1; i <= col; i++){
          int rowa  =  factorial(row);
          int cola =  factorial(i);
          int diffa =   factorial(row - i);
         int ans = (rowa)/(cola* diffa);
         sublist.add(ans); 

          }
          return sublist;
     }
    public static  ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> sublist;

//        for(int i = 0; i < numRows; i++){
          sublist =   generateRow(2, 2);
          list.add(sublist);
//        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList list;
       list =  generate(5);
        System.out.println(list);
    }
     
}