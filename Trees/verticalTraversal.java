//package Trees;
//
//import com.sun.source.tree.Tree;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.TreeMap;
//
//public class verticalTraversal {
//    static class Tuple{
//        TreeNode node;
//        int row;
//        int col;
//
//     public   Tuple(TreeNode _node, int _row, int _col){
//            node = _node;
//            row = _row;
//            col = _col;
//        }
//    }
//
//    public static ArrayList<ArrayList<Integer>> vTraversal(TreeNode root){
//        TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> map = new TreeMap<>();
//        Queue<Tuple>  q = new LinkedList();
//        q.offer(new Tuple(root, 0, 0));
//
//        while(!q.isEmpty()){
//            Tuple tuple = q.poll();
//            TreeNode node = tuple.node;
//            int x = tuple.row;
//            int y = tuple.col;
//
//            if(!map.containsKey(x)){
//                map.put(x, new TreeMap<>());
//            }
//            if(!map.get(x).containsKey(y)){
//                map.get(x).put(y, new ArrayList<>());
//            }
//            map.get(x).get(y).add(node.val);
//            if(node.left!= null){
//                q.offer(new Tuple )
//            }
//        }
//    }
//
//}
