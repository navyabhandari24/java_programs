public class queueStack {
    private int top;
    private int temp;
    private int s[];
    private int maxsize;

    stackk(int size){
        s = new int [size];
        top =-1;
        maxsize = size;
    }

    public void push(int item){
        if(top==maxsize-1){
            System.out.println("stack overflow");
        }
        else{
            s[++top]=item;
        }
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

    public boolean isEmpty(){
        return (top<0);
    }

    public int peek(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }

    public void enQueue(int x) 
    {  
        while (!s1.isEmpty())
        { 
            s2.push(s1.pop());  
        }  
        s1.push(x);  
        while (!s2.isEmpty()) 
        { 
            s1.push(s2.pop());  
        } 
    }

    public int deQueue() 
    {  
        if (s1.isEmpty()) 
        { 
            System.out.println("Q is Empty"); 
            System.exit(0); 
        } 
        int x = s1.peek(); 
        s1.pop(); 
        return x; 
    } 

    public static void main(String[] args) {
        queueStack s1 = new queueStack();
    }
}
