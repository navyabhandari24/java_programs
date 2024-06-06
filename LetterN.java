public class LetterN {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if((i==0 || i==4) && (j==0 || j==4)){
                    System.out.print("N");
                }
                else if(i==1 && (j==0 || j==1 || j==4)){
                    System.out.print("N");
                }
                else if(i==2 && (j==0 || j==2 || j==4)){
                    System.out.print("N");
                }
                else if(i==3 && (j==0 || j==3 || j==4)){
                    System.out.print("N");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");    
        }
    }
}
