public class LL2 {
    
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

    public void searchElement(int element){
        int ele=element;
        int pos=1;
        Node current = head;
        while(current!=null){
            if(current.data==ele){
                System.out.println("Element found at position - "+pos);
                return;
            }
            pos++;
            current =current.next;
        }
        System.out.println("Element not found");
    }

    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public int size(){
        int count=0;
        Node curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }

    public void mid(){
        int pos=size()/2;
        Node curr=head;
        while(pos!=0){
            curr=curr.next;
            pos--;  
        }
        System.out.println(curr.data);
    }
    public static void main(String[] args) {
        LL2 list = new LL2();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        //list.addLast(5);
        list.printList();
        //list.searchElement(0);
        //head=list.reverse(head);
        //list.printList();
        int a=list.size();
        System.out.println(a);
        list.mid();
    } 
}