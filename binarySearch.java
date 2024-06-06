import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        int arr[]={3,7,8,9,10,11,12};
        int s=0;
        int e=arr.length-1;
        int mid=(e+s)/2;
        int key=8;
        while(s<=e){
            if(key==arr[mid]){
                System.out.println("Found");
                break;
            }
            else if(key<arr[mid]){
                e=mid;
            }
            else{
                s=mid;
            }
            mid=(e+s)/2;
        }
    }
}
