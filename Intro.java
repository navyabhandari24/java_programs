import java.lang.*;
import java.util.Scanner;

public class Intro {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int a=sc.nextInt();
        System.out.println("Enter no.");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum="+sum);
    }
}
