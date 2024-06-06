public class StackLL {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void push(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void pop(){
        if(head==null){
            System.out.println("Stack underflow");
            return;
        }
        head=head.next;
    }
    public void printList(){
        
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + "-->");
            currNode=currNode.next;
            
        }
        System.out.println("Null");
        
    }
    public static void main(String[] args){
        StackLL ss = new StackLL();
        ss.push(4);
        ss.push(3);
        ss.push(2);
        ss.push(1);
        ss.printList();
        ss.pop();
        ss.pop();
        ss.printList();
    }
}
