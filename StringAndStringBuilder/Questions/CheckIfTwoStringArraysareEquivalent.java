package StringAndStringBuilder.Questions;

class CheckIfTwoStringArraysareEquivalent {
    public  static  boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       
        StringBuilder name1 = new StringBuilder();
                StringBuilder name2 = new StringBuilder();

        for(int i = 0; i < word1.length; i++){
            name1.append(word1[i]);
        }
         for(int j = 0; j < word2.length; j++){
            name2.append(word2[j]);
        }
        System.out.println(name1.toString());
        System.out.println(name2.toString());
        System.out.println(name2.toString() == name1.toString());

        System.out.println(name1.toString().equals(name2.toString()));

        return name1.equals(name2) ;

    }


    public static void main(String[] args) {
        String arr1[] = {"sa", "n"};
        String arr2[] = {"s", "an"};

        boolean ans = arrayStringsAreEqual(arr1, arr2);
    }
}