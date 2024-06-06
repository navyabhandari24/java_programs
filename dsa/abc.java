public class abc {
    public static void main(String[]args){
        int ans1[]={1,2,3,4};
        int st= 0;
        int end=ans1.length-1;
        int mid = (end+st)/2;
        double ans = (double)(ans1[mid]+ans1[mid+1])/2;
        System.out.println(ans);
        System.out.println(ans1[mid+1]);
    }
}
    
