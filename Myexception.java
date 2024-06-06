import java.util.Scanner;
class My extends Exception{
    public String getMessage(){
        return "Not sufficient balance";
    }
    public String toString(){
        return "Sufficient balance";
    }
}
public class Myexception{
    public static void main(String[] args) {
        int a;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        if(a<1000){
            try{
                throw new My();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        else{
            try{
                throw new My();
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
        }
    }
}
