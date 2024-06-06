public class ReverseLinkedList {
    static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        Node current = head;
        Node prev = null;
        
        while (current != null) {
            int temp = current.data;
            current.data = prev == null ? current.data : prev.data;
            prev = current;
            current = current.next;
            prev.data = temp;
        }
        
        return head;
    }
    
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        System.out.print("Original list: ");
        printList(head);
        
        head = reverse(head);
        
        System.out.print("Reversed list: ");
        printList(head);
    }
}
