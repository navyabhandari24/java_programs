import java.util.*;
public class Stack1 { 
    public static void main(String[] args) {
        Stack <String> s= new Stack<String>();
        s.push("Ravi");
        s.push("Ajay");
        s.push("Navya");
        s.push("Ajay");
        s.pop();
        Iterator <String> itr= s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
