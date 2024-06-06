//pacckages of pack1 and pack2

import pack1.addition;
import pack2.subtraction;
class differentpackages
{
public static void main(String[] args)
{
addition obj = new addition();
subtraction obj2= new subtraction();
obj.read(2,3);
obj2.readdata(5,2);
System.out.println("sum= "+obj.sum());
System.out.println("difference= "+obj2.subtract());
}
}