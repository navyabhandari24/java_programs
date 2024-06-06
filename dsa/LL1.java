import java.util.Scanner;
public class LL1 {
    
    Node head;
    //int size;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
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

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public void insertAt(int data, int position){
        int pos=position;
        Node newNode = new Node(data);
        if(pos==1){
            newNode.next=head;
            head=newNode;
        }
        else{
            Node previous = head;
            int count=1;
            while(count<pos-1){
                previous=previous.next;
                count++;
            }
            Node current=previous.next;
            previous.next=newNode;
            newNode.next=current;
        }
    }

    public void deleteAt(int position){
        int pos=position;
        if(pos==1){
            head=head.next;
        }
        else{
            Node previous = head;
            int count=1;
            while(count<pos-1){
                previous=previous.next;
                count++;
            }
            Node current = previous.next;
            previous.next=current.next;
        }
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
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        //list.printList();
        list.addLast(4);
        list.addLast(5);
        //list.printList();
        list.deleteFirst();
        list.deleteLast();
        //list.printList();
        //System.out.println(list.size);
        list.insertAt(6,2);
        list.printList();
        list.deleteAt(3);
        list.printList();
    }
}
