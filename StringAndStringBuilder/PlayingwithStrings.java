package StringAndStringBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayingwithStrings {

    public static void main(String[] args) {

//        String name  = "Sanskar";
////        System.out.println(name);
//        String name1 = "Sanskar";
//
//        String name2 = new String("Sanskar");
//
//        System.out.println(name1.equals(name2));
//        System.out.println(name1);


        String name = "Sanskar khandelwal";

      char[] arr =   name.toCharArray();
      char[] arr1 = {'s','a','n'};
        System.out.println(arr1);
        System.out.println(arr);
        String name4 = name.toLowerCase();
        System.out.println(name4 + "helllo");
        System.out.println( name.charAt(0));

//        System.out.println(2 + new ArrayList<>()); // Any one should be string



        String other  = "Sanska" + new ArrayList<>();

        System.out.println(other);

        String series = " ";
        for(int i = 0; i < 26 ; i++){

            series = series + 'a' ;
        }
        System.out.println(series);
//In this example everything is alright but every time the loop runs the new object is string created as we know that
// the strings is java is immutable so we cannot change it therefore every time loops run new object is created
        // So we need some sort of data type which will not create new object instead add in the original object





    }
}

