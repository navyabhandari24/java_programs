public class selectionSort {
    public static void main(String[] args) {
        int arr[] ={7,8,3,1,2};
        for(int i=0 ;i<arr.length; i++){
            int pos=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[pos] > arr[j]){
                    pos=j;
                }
            }
            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
