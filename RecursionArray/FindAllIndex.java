package RecursionArray;//package RecursionArrayQuestions;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//
//public class FindAllIndex {
//    public static void main(String[] args) {
//        int[] arr = {2,3,1,4,4,5};
//      int  target = 4;
//      findAll
//      ArrayList ans =  findAllandReturnArrayList(arr,target,0, new ArrayList<>());
//        System.out.println(ans);
//    }
//
//
////   static ArrayList<Integer> arrlist = new ArrayList<>();
////    static void findAll(int[] arr, int target, int index ) {
////
////        if(index == arr.length)
////            return;
////        if(target == arr[index])
////            arrlist.add(index);
////
////        findAll(arr,target,index+1);
////    }
//
//
//    static ArrayList<Integer> findAllandReturnArrayList(int[] arr, int target, int index,ArrayList<Integer> arrlist ) {
//
//        if(index == arr.length)
//            return arrlist;
//        if(target == arr[index])
//            arrlist.add(index);
//
//      return  findAllandReturnArrayList(arr,target,index+1, arrlist);
//    }
//
//}
