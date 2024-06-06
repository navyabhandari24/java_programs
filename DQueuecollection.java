import java.util.*;
public class DQueuecollection{
    public static void main(String[] args) {
        
        ArrayDeque <String> d=new ArrayDeque<String>();
        d.add("Gautam");
        d.add("Karan");
        d.add("Jay");
        d.add("Ravi");

        for(String str:d){
            System.out.println(str);
        }
    }
}