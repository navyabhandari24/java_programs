class Employee1{
    int salary;
    String name;

    public int getsalary(){
        return salary;
    }
    
    public String getname(){
        return name;
    }

    public void setname(String n){
        name=n;
    }
}


class Square{
    int side;
    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}
public class class_Questions {
    public static void main(String[] args){
        //Problem 1

        Employee1 navya  = new Employee1();
        navya.setname("Navya Bhandari");
        System.out.println(navya.getname());
        navya.salary=1000000;
        System.out.println(navya.getsalary());

        //Problem 2

        Square sq = new Square();
        sq.side=4; 
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
    
}
