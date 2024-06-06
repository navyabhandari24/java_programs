class Demo{
    public int value=10;
}
Demo(){
    value=20;
}

public class Tester {
    public static void main(String[] args) {
        Demo demo=new Demo();
        System.out.println(demo.value);
    }
}
