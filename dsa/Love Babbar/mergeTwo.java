import javax.naming.spi.DirStateFactory.Result;

public class mergeTwo {
    Node head;
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

    public Node merge(Node a, Node b){
        Node dummy = new Node(0);
        Node tail = dummy;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                a=a.next;
            }
            else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        if(a==null){
            tail.next=b;
        }
        else{
            tail.next=a;
        }
        return dummy.next;
    }

    public Node add(Node a, Node b){
        Node dummy = new Node(0);
        Node tail = dummy;
        int carry = 0;
        while(a!=null || b!=null){
            int x = (a!=null)?a.data:0;
            int y = (b!=null)?b.data:0;
            int sum = carry+x+y;
            carry=sum/10;
            tail.next=new Node(sum%10);
            tail=tail.next;
            if(a!=null){
                a=a.next;
            }
            if(b!=null){
                b=b.next;
            }
        }
        if(carry>0){
            tail.next = new Node(carry);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        mergeTwo list1 = new mergeTwo();
        mergeTwo list2 = new mergeTwo();
        list1.addLast(1);
        list1.addLast(4);
        list1.addLast(8);
        list2.addLast(3);
        list2.addLast(6);
        list2.addLast(7);
        list1.printList();
        list2.printList();
        mergeTwo result = new mergeTwo();
        result.head = result.add(list1.head,list2.head);
        result.printList();
    }
}

