class Employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name); 
    }
}

public class custom_class {
    public static void main(String[] args){
        System.out.println("This is our custom class");
        Employee Navya = new Employee();   //Instantiating a new Employee object
        Employee Naitik = new Employee();   //Instantiating a new Employee object
        
        //Setting Attributes
        Navya.id = 12;
        Navya.name= "Navya Bhandari";
        Naitik.id= 15;
        Naitik.name="Naitik Dani";

        //Printing the Attributes

        //System.out.println(Navya.id);
        //System.out.println(Navya.name);

        Navya.printdetails();
        Naitik.printdetails();
    }
}
