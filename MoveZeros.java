class MoveZeros{
    public void printArray(int[] arr){
        for(int i=0; i<=arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void moveZeros(int[] arr){
        int count=0;
        for(int i=0; i<arr.length;i++){
                if(arr[i]!=0){
                    count++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {2,5,0,6,0,1};
        MoveZeros aa=new MoveZeros();
        aa.moveZeros(arr);
        aa.printArray(arr);
    }
}