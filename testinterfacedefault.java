//default interface 
interface Drawable
{
void draw();
default void msg()
{
System.out.println("Default Method");
}
}
class Rectangle implements Drawable
{
public void draw()
{
System.out.println("drwaing complete");
}
}
class testinterfacedefault
{
public static void main(String[] args){
Rectangle d=new Rectangle();
d.draw();
d.msg();
}
}
