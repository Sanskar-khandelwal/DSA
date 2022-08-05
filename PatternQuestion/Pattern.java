package PatternQuestion;

public class Pattern {
    public static void main(String[] args) {
        pattern2(5);
    }

 static void pattern2(int n) {
     for (int row = 1; row <= n; row++) {
         for (int col = 0; col < row; col++) {
             System.out.print("* ");
         }
         System.out.println();
     }
    }
}
