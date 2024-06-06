abstract class base {
	abstract void print();
	base(){
	    print();
	    }
}

class derived extends base {
    int a= 10;
    void print(){
        System.out.println(a);
        }
        
   public static void main(String[] args) {
		derived d= new derived();
		d.print();
	}
    
}
    

