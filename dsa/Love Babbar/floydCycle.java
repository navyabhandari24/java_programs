public class floydCycle{
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

    public void createLoop(int n){
        Node temp = head;
        int pos = n;
        int count = 1;
        while(count!=pos){
            temp=temp.next;
            count++;
        }
        Node ls = head;
        while(ls.next!=null){
            ls=ls.next;
        }
        ls.next = temp;
    }

    public Node loopDetect(){
        Node slowptr = head;
        Node fastptr = head;
        while(true){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
            if(slowptr==fastptr){
                return getStartNode(slowptr);
                break;
            }
        }
        return null;
    }

    Node getStarNode(Node slowptr){
        Node temp = head;
        while(temp!=slowptr){
            temp=temp.next;
            slowptr=slowptr.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        floydCycle obj = new floydCycle();
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);
        obj.addLast(6);
        obj.printList();
        obj.createLoop(3);
        //obj.printList();
        System.out.println(obj.loopDetect().data);
    }
}