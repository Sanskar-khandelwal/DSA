package LL;
public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    public void insertAsfirst(int val){
        Node node = new Node();
        node.value = val;
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size +=1;
    }

   public  void  insertAsLast(int val){

        if(tail == null){
            insertAsfirst(val);
            return;
        }
       Node node = new Node();
       node.value = val;
       node.next = null;

       tail.next = node;
       size++;

    }



  public void  insertAsLastUsingtemp(int val){
        Node node = new Node();
        node.next = null;
        node.value = val;

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void display(){
        Node temp;
        temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void reverse(){
        Node p = head;
        Node q = null;
       Node r = null;

        while(p!=null){
           r = q;
           q =p;

          p =  p.next;

          q.next = r;
        }
        head = q;

    }
  private class Node {
      private int value;
      private Node next;
  }
}
