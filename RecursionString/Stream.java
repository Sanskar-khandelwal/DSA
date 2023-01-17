package RecursionString;

public class Stream {
    public static void main(String[] args) {
        String str = "sanskar";
   skip(str, "");

    }
    public static void skip(String original, String ans){

        if(original == ""){
            System.out.println(ans);
            return;
        }

        if(original.charAt(0) != 'a'){
            ans = ans + original.charAt(0);
        }
        skip(original.substring(1), ans);
 }

}
