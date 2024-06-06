public class pat {
    int n=5;
    for(int i=0; i<=n;i++){
        for(int j=0; j<=n;j++){
            if((i==j)&&(i!=n/2+1)){
                System.out.print("-"+" ");
            }
            else if(i==n/2+1){
                
            }
            else{
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
