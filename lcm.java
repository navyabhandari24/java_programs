import java.util.Scanner;
public class lcm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextiInt();
        int b=sc.nextInt();
        int min=0;
        if(a>b){
            min=a;
        }
        else{
            min=b;
        }
        for(int i=min; i<=(a*b);min++){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
        }
    }
}