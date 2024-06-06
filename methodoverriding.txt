class Super
{
 int x;
Super(int x)
{
this.x=x;
}
void display()
{
System.out.println("Super x="+x);
}
}//super class close
class Sub extends Super
{
int y;
Sub(int x, int y)
{
super(x);
this.y=y;
}
void display()
{
//super.display();

//System.out.println("Super x="+x);
System.out.println("Sub y="+y);
}
}

class methodoverriding
{
public static void main(String args[])
{
Sub S=new Sub(100,200);
S.display();// it will call subclass method
}
}




