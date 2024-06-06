
abstract class Base2{
    public Base2(){
        System.out.println("Main Base2 ka constructor hu");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    
}

class child2 extends Base2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}
public class Abstractclass {
    public static void main(String[] args) {
        
    }
}
