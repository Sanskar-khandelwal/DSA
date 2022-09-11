package LL;

import org.w3c.dom.ls.LSOutput;

public class LL {

    private Node head;
  private Node tail;

  private int size;

    public LL() {
        this.size = size;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        public Node(int value){
            this.value = value;
        }
    }


    public void insertAsFirst(int value){
        Node temp = new Node(value, head);
        head = temp;

        if(tail == null){
            tail = head;
        }
        size+=1;
    }


    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
    }
        System.out.print("end");
    }

    public void insertLast(int val){
        if(tail == null){
            insertAsFirst(val);
            return;
        }

        Node temp = new Node(val, null);
        tail.next = temp;
        tail = temp;
        size++;

    }


   public void insertAt(int val, int index){

        if(index == 0){
            insertAsFirst(val);
            return;
        }



        Node temp = head;


        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;

        size++;
   }





}
