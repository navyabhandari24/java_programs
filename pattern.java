import java.util.Scanner;
public class pattern{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m,n;
        for(m=1; m<=a; m++){
            for(n=1; n<=a-m; n++){
                System.out.print(" ");
            }
            for(n=1; n<=m*2-1; n++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(m=a-1; m>0; m--){
            for(n=1; n<=a-m; n++){
                System.out.print(" ");
            }
            for(n=1; n<=m*2-1; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}