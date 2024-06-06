class A2 {
    int i=10;
}
class A3 extends A2{
    int i=20;
}
public class A1{
    public static void main(String[] args) {
        A2 a=new A3();
        System.out.println(a.i);
    }
}
