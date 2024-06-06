public class XYZ {
    static float divide(int a, int b){
        int i=a;
        int j=b;
        float res=i/j;
        return res;
    }
    public static void main(String[] args) {
        // String s="1.32";
        // Float res=Float.valueOf(s);
        // System.out.println(res);

        // String s="Navya";
        // System.out.println(s.charAt(1));

        try{
            float x=divide(10,4);
            System.out.println(x);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

    }
}
