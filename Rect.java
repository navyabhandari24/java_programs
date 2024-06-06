import java.lang.*;
class Area{
    int len,wid; 
    void setDim(int x , int y){
        len=x;
        wid=y;
    }
    int getArea(){
        return(len*wid);
    }
}
class Rect{
    public static void main(String[] args){
        Area S = new Area();
        S.setDim(2,4);
        System.out.println(S.getArea());
    }
}