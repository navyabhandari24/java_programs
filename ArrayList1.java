import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Ajay");
        list.add("Navya");
        list.add("Ajay");

        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
