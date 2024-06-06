interface Printable
{void print();
}
interface showable extends Printable
{
void show();
}
class inheritedinterface implements showable
{
public void print()
{
System.out.println("Hello");
}
public void show()
{
System.out.println("Welcome");
}
public static void main(String [] args){
inheritedinterface obj = new inheritedinterface();
obj.print();
obj.show();
}
}
 
