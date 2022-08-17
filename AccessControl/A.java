package AccessControl;


public class A {
   private int num;
   // private means you will only be able to use this in this class only

    //public means you can access it anywhere
    // default access modifier
    // It will not allow to use in different package but in the same package it is allowed in default access modifier
   String name;
   int[] arr;

   public int getNum(){
       return num;
   }

   public int setNum(int num){
       this.num = num;
       return num;
   }


   public A (int num, String name){
       this.num = num;
       this.name = name;
       this.arr = new int[num];
   }



}
