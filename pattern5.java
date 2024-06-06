import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int upperleft = n/2,upperright = n/2;
    int downleft = 2, downright = n-3;
    for(int i = 0; i<n; i++){
        for(int j=0; j<n; j++){
            if(i==0 || i==n-1 || j==0 || j==n-1){
                System.out.print("* ");
            }
            else{
                if(j==upperleft || j==upperright){
                    System.out.print("* ");
                }
                elseif(i>n/2 && (j==downleft || j==downright)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        }
        if(i>0 && i<=n/2){
            upperleft--;
            upperright++;
        }
        System.out.println();
    }
    }
    
}
