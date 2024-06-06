import java.util.Scanner;
public class ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt=sc.nextInt();
        if(amt>=20000){
            System.out.println("Discount = 10%");
            System.out.println(amt-(amt*0.1));
        }
        if(amt>=10000 && amt<20000){
            System.out.println("Discount = 5%");
            System.out.println(amt-(amt*0.05));
        }
        if(amt>=5000 && amt<10000){
            System.out.println("Discount = 2%");
            System.out.println(amt-(amt*0.02));
        }
        if(amt<5000){
            System.out.println("Discount = 0%");
            System.out.println(amt);
        }
    }    
}
