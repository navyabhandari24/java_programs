class MyThread extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("My thread is running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("My thread 2 is running");
            System.out.println("I am sad!"); 
            i++;
        }
    }
}

public class ThreadTest {
    public static void main(String [] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
