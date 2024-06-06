public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        for(int i=0; i<arr.length; i++){
            int cur = arr[i];
            int j=i-1;
            while(j>=0 && cur<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = cur;
        }
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
