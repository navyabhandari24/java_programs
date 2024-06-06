interface Bank
{
float rateofinterest();
}
class SBI implements Bank{
public float rateofinterest()
{return 9.7f;}
}
class PNB implements Bank{
public float rateofinterest()
{return 9.7f;}
}
class bankinterface
{
public static void main(String [] args){
Bank b=new SBI();
System.out.println("ROI: "+ b.rateofinterest());
Bank c=new PNB();
System.out.println("ROI: "+ c.rateofinterest());
}
}