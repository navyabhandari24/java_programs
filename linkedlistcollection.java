import java.util.*;
public class linkedlistcollection{
    //Main Method
    public static void main(String[] args) {
        //Declaring the Linked list
        LinkedList <Integer> LL = new LinkedList <Integer>();

        //Appending new elements at the end of list
        for(int i=1; i<=5; i++){
            LL.add(i);
        }

        //Printing elements
        System.out.println(LL);

        //Removing
        LL.remove(3);

        //Displaying the list after collection
        System.out.println(LL);

        //Printing elements one by one
        for(int i=0; i<LL.size(); i++){
            System.out.print(LL.get(i)+" ");
        }
    }
}