import java.util.Scanner;

public class Recursion {
    public int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    public int fib(int n){
        if(n<=1){
            return n;
        }
        else{
            return fib(n-1) + fib(n-2); 
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  
        //System.out.println("Enter thr number");
        //int x=sc.nextInt();
        Recursion R = new Recursion();
        //System.out.println(R.fact(x));
        int n =9;
        System.out.println(R.fib(n));
    } 
}
