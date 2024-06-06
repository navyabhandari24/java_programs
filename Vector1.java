import java.util.*;
public class Vector1 {
    public static void main(String[] args) {
        Vector <String> v = new Vector<String>();
        v.add("Ravi");
        v.add("Ajay");
        v.add("Navya");
        v.add("Ajay");

        Iterator <String> itr= v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
