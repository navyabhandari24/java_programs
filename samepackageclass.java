import pack1.rectangle2;
import pack1.addition;
class samepackageclass
{
public static void main(String []args)
{
rectangle2 obj = new rectangle2();
addition obj2 = new addition();
obj.get(10,10);
obj2.read(5,2);
System.out.println("area of rectangle= "+ obj.arearec());
System.out.println("sum= "+obj2.sum());
}
}