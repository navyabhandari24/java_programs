class Z{
    public void print(int n, char c){
        System.out.println("Integer is "+ n + " Character is "+c);
    }
    public void print(char c,int n){
        System.out.println("Character is "+c+" Integer is "+n);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Z a = new Z();
        a.print(5, 'A');
        a.print('R',7);
    }
}
