import java.util.Scanner;
import java.util.*;
public class maxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int maxi=-1;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,ar[i]);
        }
        System.out.println(maxi);
        int mini=10000;
        for(int i=0;i<n;i++){
            mini=Math.min(mini,ar[i]);
        }
        System.out.println(mini);
    }
}
