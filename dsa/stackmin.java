public class stackmin {
    private int top;
    private int temp;
    private int s[];
    private int maxsize;
    private int min;

    stackk(int size){
        s = new int [size];
        top =-1;
        maxsize = size;
        min=-1;
    }

    public void push(int item){
        if(top==maxsize-1){
            System.out.println("stack overflow");
        }
        else{
            s[++top]=item;
        }
        if()
    }

    public void traversing(){
        for(int i=top; i>=0;i--){
            System.out.println(s[i]);
        }
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            top--;
        }
    }

    public static void main(String[] args) {
        stackk ss = new stackk(5);
        ss.push(5);
        ss.push(4);
        ss.push(3);
        ss.push(2);
        ss.push(1);
        ss.traversing();
        System.out.println("After popping");
        ss.pop();
        ss.pop();
        ss.pop();
        ss.traversing();
    }
}
