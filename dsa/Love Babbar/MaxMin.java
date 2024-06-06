
public class MaxMin {
    public void Max(int []arr){
        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max element is "+max);
    }

    public void Min(int []arr){
        int min=arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min element is "+min);
    }

    public static void main(String[] args) {
        MaxMin a = new MaxMin();
        int[] arr= {3,7,4,5,9};
        a.Max(arr);
        a.Min(arr);
    }
}
