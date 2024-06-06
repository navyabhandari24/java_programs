abstract class P{
    abstract void show1();
}
abstract class C extends P{

}
public class Test extends C{
    void show1(){
        System.out.println("Show1");
    }
    public static void main(String[] args) {
        Test a = new Test();
        a.show1();
    }
}


