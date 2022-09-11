package Stack;

public class Stack{
   protected int[] data;
   //not a dynamic stack
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public  Stack(){
        this(DEFAULT_SIZE); // call it as a constructor this is used here
    }

    public Stack(int size){
        this.data = new int[size];
    }


    public boolean push(int item){

        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

private boolean isFull(){
        return ptr == data.length-1; // ptr is the last index
}

private boolean isEmpty(){
        return ptr == -1;
}

public int pop() throws Exception {
        if(isEmpty()){
           throw new CustomException("Cannot pop from an empty stack!!");
        }

        return data[ptr--];
}

public int peek() throws CustomException {
    if(isEmpty()){
        throw new CustomException("Cannot find peak in empty stack");
    }

    return data[ptr];
}
}
