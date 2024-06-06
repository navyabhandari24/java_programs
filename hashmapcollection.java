//work like dictionary in python
import java.util.*;
public class hashmapcollection {
    public static void main(String[] args) {
        HashMap <Integer,String> m = new HashMap <Integer,String>();
        //Put elements in map
        m.put(1,"Mango");
        m.put(2,"Apple");
        m.put(3,"Banana");
        m.put(4,"Grapes");
        System.out.println(m);

        System.out.println("Iterating HashMap...");
        for(Map.Entry mp: m.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }
    }
}
