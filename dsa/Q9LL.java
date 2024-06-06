public class Q9LL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static int countNodes(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    static int findMin(Node head) {
        if (head == null) {
            return -1; // or throw an exception
        }
        int min = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    static int findMax(Node head) {
        if (head == null) {
            return -1; // or throw an exception
        }
        int max = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(9);
        head.next.next.next = new Node(6);

        System.out.println("Total number of nodes: " + countNodes(head));
        System.out.println("Minimum value: " + findMin(head));
        System.out.println("Maximum value: " + findMax(head));
    }
}
