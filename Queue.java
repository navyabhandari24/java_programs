public class Queue {
    private int maxSize;
    private int []q;
    private int front;
    private int rear;
    private int curr;

    public Queue(int size){
        this.maxSize=size;
        this.q = new int [size];
        front = 0;
        rear = -1;
        curr =0;
    }

    public void insert(int item){
        if(maxSize==curr){
            System.out.println("Full");
            return;
        }
        if(rear==maxSize-1){
            rear=-1;
        }
        q[++rear]=item;
        curr++;
    }

    public int delete(){
        if(curr==0){
            System.out.println("Empty");
        }
        int temp = q[front++];
        if(front==maxSize){
            front=0;
        }
        curr--;
        return temp;
    }

    public static void main(String[] args) {
        Queue qu = new Queue(4);
        qu.insert(1);
        qu.insert(2);
        qu.insert(3);
        System.out.println("Deleted" + qu.delete());
    }
}