import java.util.EmptyStackException;

public class Stack {
    Node top;
    int length;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    
    public Stack(){
        top=null;
        length=0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void push(int data){
        Node temp = new Node(data);
        temp.next = top;
        top=temp;
        length++;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(10);
        obj.push(5);
        obj.push(3);
        obj.pop();
    }
}
