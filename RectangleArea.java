import java.lang.*;
class Rectangle{
    int length, width;
    void getData(int x, int y){
        length=x;
        width=y;
    }
    int rectarea(){
        int area=length*width;
        return area;
    }
}
class RectangleArea{
    public static void main(String args[]){
        Rectangle R=new Rectangle();
        R.length=23;
        R.width=20;
        int cal=R.length*R.width;
        System.out.println("Area of rectangle using data"+cal);
        Rectangle S=new Rectangle();
        S.getData(10,2);
        System.out.println(S.rectarea());
    }
}