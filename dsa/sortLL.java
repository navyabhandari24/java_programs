public class sortLL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head; // list is already sorted or contains only one element
        }

        Node prev = null;
        Node slow = head;
        Node fast = head;

        // use slow and fast pointers to find the middle of the list
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null; // break the list into two halves

        Node left = sortList(head);
        Node right = sortList(slow);

        return merge(left, right);
    }

    static Node merge(Node left, Node right) {
        Node dummy = new Node(0);
        Node current = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(1);

        head = sortList(head);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
