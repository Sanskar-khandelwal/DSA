package RecusionSorting;

/**
 * AverageWithoutHighestAndLowest
 */
public class AverageWithoutHighestAndLowest {
public static void main(String[] args) {
    

     int [] arr = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,
            67000,6000,1000,11000};

    double ans =  average(arr);
    System.out.println(ans);

}
    


public static double average(int[] salary) {
        
    double sum = 0;
    double smallest = 53453463;
        double greatest = -1;
        double N = salary.length -2;
   
        
       for(int i = 0 ; i < salary.length ; i++) {
        sum += salary[i];
         if(salary[i] > greatest){
        greatest = salary[i];
         }
           if(salary[i] < smallest){
     smallest = salary[i];
           }
       }
        
        return (sum - (greatest + smallest))/N;
    }


}

