public class ass13 {
    int num =100;
    public void calc(int num)
    {
        this.num=num*10;
    }
    public void printnum(){
        System.out.println(num);
    }
    public static void main(String[] args) {
        ass13 obj = new ass13();
        obj.calc(2);
        obj.printnum();
    }
}
