import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList <String> ll = new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Ajay");
        ll.add("Navya");
        ll.add("Ajay");

        Iterator itr= ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
