package StringAndStringBuilder;

import java.util.Locale;

public class SB {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        System.out.println(builder);
        for(int i = 0; i <=25 ; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        String naam = "Sam";
        StringBuilder name = new StringBuilder("Sam");

        System.out.println(name);
    }

}
