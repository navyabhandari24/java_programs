
public class Reverse {
    public void rev(int[] arr){
        int t,k = arr.length;
        for(int i=0; i<arr.length/2;i++){
            t = arr[i];
            arr[i]= arr[k-i-1];
            arr[k-i-1]=t;
        }
    }
    public static void main(String[] args) {
        Reverse R = new Reverse();
        int [] arr  = {1,2,3,4,5};
        R.rev(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
