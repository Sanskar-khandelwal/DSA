package PatternQuestion;

import org.w3c.dom.ls.LSOutput;

public class Pattern29 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {

        for (int row = 1; row <= 2*n -1 ; row++) {
            for (int col = 1; col <=  2*n -1; col++) {


   if(row > 5){
      if(col <= 2*n - row || col >= row){
          System.out.print("* ");
      }
      else
          System.out.print("  ");
   }
      else {
       if (col <= row || col >= 2 * n - row)
           System.out.print("* ");

       else
           System.out.print("  ");
   }

            }
            System.out.println();
        }
    }
}

