package PatternQuestion;

public class Pattern28 {
    public static void main(String[] args) {
        pattern(5);

    }

    static void pattern(int n) {
        for (int row = 1; row <= 2*n - 1; row++) {

            int totalNumberOfCol = row > n ? 2* n- row : row;

            int spaces = row < n ? n - row : row - n; // row se matching
//            or spaces = n - totalNumberOfCol;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");

            }
            for (int col = 1; col <= totalNumberOfCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

