public class ass4
{
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--)
                System.out.print(" ");
            for (int k = i; k >= 1; k--)
                System.out.print(k);
            System.out.println();
        }
    }
}
