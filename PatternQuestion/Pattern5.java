package PatternQuestion;

public class Pattern5  {
    public static void main(String[] args) {
        pattern(5);

    }

    static void pattern(int n) {
        for (int row = 1; row <= 2*n -1 ; row++) {
            int totalNumberofCol = row > n ? 2* n - row : row;
            for (int col = 1; col <= totalNumberofCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

