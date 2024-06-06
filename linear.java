import java.util.*;
public class linear{
    public static void main(String[] args) {
        int arr[]={2,5,7,8,9};
        int key=8;
        for(int i=0; i<5; i++){
            if(arr[i]==key){
                System.out.println("Found");
                break;
            }
        }
        System.out.println("Not Found");
    }
}

