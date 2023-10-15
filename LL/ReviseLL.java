package LL;


public class ReviseLL {

    Node head;
    Node tail;
    int size;
private class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
    }
    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

    public  void insertAsFirst(int val){
      Node node = new Node(val);
      head = node;

      if(tail == null){
          tail = head;
      }
      size+=1;


    }

    public void insertAsLast(int val){
    if (tail == null){
        insertAsFirst(val);
    }
    else {
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size+=1;
    }
    }

    public void display(){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.val + " -> ");
        temp = temp.next;
    }
    System.out.print("end");
    }

    public void insertAtIndex(int index, int val){
      Node forward  = head;
      Node backward = null;
      while(index > 0){
          backward = forward;
          forward = forward.next;
          index--;
      }
      Node node = new Node(val);
      backward.next = node;
      node.next = forward;
    }
    public void insertRec(int index, int val){
       if(index > 0){
            insertRec(index-=1, val);
            return;
       }
       Node node = new Node(val);
        
    }

    public static void main(String[] args) {
        ReviseLL list = new ReviseLL();
        list.insertAsFirst(3);
        list.insertAsLast(4);
        list.insertAsLast(5);

        list.insertAsLast(6);
        list.insertAsLast(7);
        list.insertAsLast(8);
        list.insertAtIndex(3, 99);
        list.display();

    }


}
