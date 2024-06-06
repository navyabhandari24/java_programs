
interface Bank{
    float getrateofinterest();
}
class SBI implements Bank{
    public float getrateofinterest(){
        return 8.7f;
    }
}
class Axis implements Bank{
    public float getrateofinterest(){
        return 9.1f;
    }
}
class PNB implements Bank{
    public float getrateofinterest(){
        return 7.9f;
    }
}


public class Test1 {
    public static void main(String[] args){

        Bank b;
        b=new SBI();
        System.out.println("SBI "+b.getrateofinterest());
        b=new Axis();
        System.out.println("Axis "+b.getrateofinterest());
        b=new PNB();
        System.out.println("PNB "+b.getrateofinterest());
    }
}    
