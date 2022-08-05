package LeetcodeArrayQuestion;

/**
 * AverageWithoutHighestAndLowest
 */
public class AverageWithoutHighestAndLowest {
public static void main(String[] args) {
    

     int [] arr = {1000, 2000 , 3000};

    double ans =  average(arr);
    System.out.println(ans);

}
    


public static double average(int[] salary) {
        
    int sum = 0;
    int smallest = 53453463;
        int greatest = -1;
        int N = salary.length -2;
   
        
       for(int i = 0 ; i < salary.length ; i++) {
        sum += salary[i];
         if(salary[i] > greatest){
        greatest = salary[i];
         }
           else if(salary[i] < smallest){
     smallest = salary[i];
           }
       }
        
        return (sum - (greatest + smallest))/N;
    }


}

