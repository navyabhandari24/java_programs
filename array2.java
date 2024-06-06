import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int tar=sc.nextInt();
        for(int i=0; i<n-1; i++){
            if(arr[i]+arr[i+1]==tar){
                System.out.println(i+" "+(i+1));
                break;
            }
        }
    }
}


