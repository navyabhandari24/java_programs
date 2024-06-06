// Insert a node in a sorted Linked List

public class LL4 {
    
    static Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
         currNode.next=newNode;
    }

    public void printList(){
        //size=0;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + "-->");
            currNode=currNode.next;
            //size++;
        }
        System.out.println("Null");
        //System.out.println(size);
    }

    public Node insertSort(int d){
        Node newNode = new Node(d);
            Node current = head;
            Node previous = null;
            while(current!=null && current.data<newNode.data){
                previous=current;
                current=current.next;
            }
            newNode.next = current;
            previous.next = newNode;
            return head;
    }

    public boolean loopCheck(){
        Node fastptr = head;
        Node slowptr = head;
        while(fastptr!=null && fastptr.next!=null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;

            if(slowptr==fastptr){
                return true;
            }
        }  
        return false;
    }
    public static void main(String[] args) {
        LL4 list = new LL4();
        list.addLast(1);
        list.addLast(4);
        list.addLast(9);
        list.addLast(25);
        list.printList();
        list.insertSort(16);
        list.printList();
        System.out.println(list.loopCheck());
    }
}
    
