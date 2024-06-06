import java.util.Scanner;
public class array1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=2;j<ar[i]/2;j++){
                if(ar[i]%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(ar[i]);
            }
        }
    }
}