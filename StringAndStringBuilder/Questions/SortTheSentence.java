package StringAndStringBuilder.Questions;

import java.util.Arrays;

class SortTheSentence {
    public static String sortSentence(String s) {
      String[] arr =  s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[arr[i].charAt(arr[i].length() - 1)] =

        }
        System.out.println(Arrays.toString(arr));
        return arr.toString();

    }

    public static void main(String[] args) {
        sortSentence("Sankar3 am2 I1");
    }
}