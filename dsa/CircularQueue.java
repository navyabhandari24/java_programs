public class CircularQueue {
    private int[] queue;
    private int rear;
    private int front;
    private int size;

    public CircularQueue(int n){
        size = n;
        queue = new int[size];
        rear=front=-1;
    }

    private int delete(){
        int temp;
        if(front ==-1 || rear==-1){
            System.out.println("Queue is Empty");
        }
        else if(rear==front){
            temp=queue[front];
            rear=front =-1;
        }
        else if(front==size-1){
            temp=queue[front];
            front=0;
        }
        else{
            temp=queue[front];
            front++;
        }
        return -1;
    }
    private void insert(int item){
        if(rear==size+1 || front==rear+1){
            System.out.println("Queue is full");
        }
        else if(front == -1 && rear==-1){
            front=rear=0;
            queue[rear]=item;
        }
        else if(rear==size-1){
            rear=0;
            queue[rear]=item;
        }
        else{
            rear++;
            queue[rear]=item;
        }
    }
    private void print(){
        if(front ==-1){
            System.out.println("Queue is Empty");
            return;
        }
        if(rear>=front){
            for(int i =front; i<=rear; i++){
                System.out.print(queue[i]+" ");
            }
        }
        else{
            for(int i=front; i<size; i++){
                System.out.print(queue[i]+" ");
            }
            for(int i=0; i<=rear; i++){
                System.out.print(queue[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        CircularQueue cqueue = new CircularQueue(5);
        cqueue.print();
        cqueue.insert(0);
        cqueue.print();
        cqueue.insert(10);
        cqueue.print();
        cqueue.insert(20);
        cqueue.print();
        cqueue.insert(30);
        cqueue.print();
        cqueue.delete();
        cqueue.print();
        cqueue.insert(40);
        cqueue.print();
        cqueue.insert(50);
        cqueue.print();
    }
}
