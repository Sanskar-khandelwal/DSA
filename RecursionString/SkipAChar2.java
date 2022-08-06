package RecursionString;

public class SkipAChar2 {


    public static void main(String[] args) {
       String ans =  skip("Baccad");
        System.out.println(ans);
    }

     static String skip(String up) {
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip(up.substring(1));
        }
        else{
            return ch + skip(up.substring(1));
        }

    }
}

