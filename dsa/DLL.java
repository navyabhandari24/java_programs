public class DLL {
    Node head;
    Node tail;
    int length;
    class Node{
        int data;
        Node next;
        Node previous;

        public Node(int data){
            this.data = data;
        }
    }

    public DLL(){
        this.head = null;
        this.tail = null;
        this.length=  0;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public int length(){
        return length;
    }

    public void displayForward(){
        if(head==null){
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward(){
        if(tail==null){
            return;
        }
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.previous;
        }
        System.out.println("null");
    }

    public void addFirstt(int data){
        Node newNode =  new Node(data);
        if(isEmpty()){
            tail=newNode;
        }
        else{
            head.previous = newNode;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLastt(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=newNode;
        }
        else{
            tail.next=newNode;
            newNode.previous=tail;
        }
        tail=newNode;
    }

    public static void main(String[] args) {
        DLL obj = new DLL();
        obj.addFirstt(4);
        obj.addFirstt(3);
        obj.addFirstt(2);
        obj.addFirstt(1);
        obj.addLastt(5);
        obj.displayForward();
        //obj.displayBackward();
        
        obj.displayForward();
    }
}
