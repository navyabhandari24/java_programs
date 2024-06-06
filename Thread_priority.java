class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("Thank you"+this.getName());
    }
}

public class Thread_priority {
    public static void main(String[] args) {
        //Ready Queue: T1, T2, T3, T4, T5
        Mythr t1 = new Mythr("Navya");
        Mythr t2 = new Mythr("Divya");
        Mythr t3 = new Mythr("Khushi");
        Mythr t4 = new Mythr("Pranjal");
        Mythr t5 = new Mythr("Sparsh");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
