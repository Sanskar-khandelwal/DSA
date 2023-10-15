package LL;


public class ReviseLL {

    public Node head;
    public  Node tail;
    public int size;
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
    public Node insertRec(int index, int val, Node node){
        if(index == 0){
            Node temp = new Node(val);
            size++;
            return temp;
        }
        node.next = insertRec(index--, val, node.next);
        return node;

    }

    public void reverseLL(){
        Node second = head;
        Node third = null;
        Node first = head.next;

        while(first!=null){
            second.next = third;
            third = second;
            second = first;
            first = first.next;
        }
        second.next = third;
        head = second;
    }


    public void removeSortedFromLL(){
        Node forward = head.next;
        Node backward = head;

        while(forward != null){
            if(forward.val == backward.val){
                if(forward.next == null){
                    backward.next = null;
                    forward = null;
                    return;
                }
                forward = forward.next;
            }
            else if(backward.val < forward.val){

                backward.next = forward;
                backward = forward;
                forward = forward.next;

            }
        }
    }


    public static void main(String[] args) {
        ReviseLL list = new ReviseLL();
        list.insertAsFirst(3);
        list.insertAsLast(4);
        list.insertAsLast(4);
        list.insertAsLast(5);
        list.insertAsLast(7);
        list.insertAsLast(7);
        list.insertAsLast(7);
        list.insertAsLast(8);
        list.insertAsLast(8);
        list.insertAsLast(9);
        list.insertAsLast(9);
        list.insertAsLast(9);
        list.insertAsLast(9);
        list.insertAsLast(9);
        list.insertAsLast(9);
        list.insertAsLast(9);
        list.insertAsLast(10);
        list.removeSortedFromLL();
//        list.reverseLL();
        list.display();

    }


}
