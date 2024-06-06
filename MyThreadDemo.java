public class MyThreadDemo implements Runnable
{
public void run()
{
System.out.println("Thread is running");
}
public static void main(String[] args)
{
MyThreadDemo obj = new MyThreadDemo();
Thread threadObj = new Thread(obj); // 1
threadObj.start(); // 2
threadObj.run();// 3
}
}