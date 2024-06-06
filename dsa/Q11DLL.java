public class Q11DLL {
    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static Node search(Node head, int item) {
        Node current = head;
        while (current != null && current.data != item) {
            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        int item = 7;
        Node result = search(head, item);

        if (result != null) {
            System.out.println(item + " found in the list");
        } else {
            System.out.println(item + " not found in the list");
        }
    }
}
