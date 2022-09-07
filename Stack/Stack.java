package Stack;

public class Stack {
   private  int size;
    private int top = -1;
     int[] arr;
   public static  final int  default_size = 5;



      public Stack(){
           this(default_size);
      }

     public Stack(int size){
           this.size = 5;
           this.arr =  new int[this.size];
     }

     public void push(int data){
           if(top == size-1){
                System.out.println("stack is full!!");
           }

           top++;
           arr[top] = data;


     }


     public int pop(){
           int x = -1;
           if(top == -1){
                System.out.println("cannot pop value from the stack, it is already empty");
           }
           else {
             x = arr[top];
                top--;
           }
          return x;
     }


 // finding an element at given postion
     public int peak(int pos){
          int x = -1;
          if( top -pos + 1 < 0){
               System.out.println("invalid position");
               return -1;
          }
          x = arr[top-pos+1];
          return x;
     }

     public int StackTop(){
           return arr[top];
     }
//     public static void main(String[] args) {
//          Stack s = new Stack(5);
//          s.push(3);
//          s.push(2);
//          s.push(5);
//          s.push(5);
//          s.push(5);
////          s.peak(2);
//          s.pop();
//          s.pop();
//        int x =   s.StackTop();
//          System.out.println(x);
//     }
}

