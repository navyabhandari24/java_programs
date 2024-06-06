abstract class A
{
public void disp()
{
System.out.println("Concrete method of parent class");
}
abstract public void disp2();
}
class B extends A
{
public void disp2()
{
System.out.println("Overriding abstract method");
}
public static void main(String args[])
{
B obj = new B();
obj.disp();
}
}