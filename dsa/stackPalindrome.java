public class stackPalindrome {
    static char[] s;
    static int top=-1;

    public static void push(char e){
        s[++top] = e;
    }

    public static char pop(){
        return s[top--];
    }

    public static boolean isPalindrome(char[] str){
        int length = str.length;
        s = new char[length * 4];
        int i, mid = length / 2;
        for (i = 0; i < mid; i++){
            push(str[i]);
        }
        if (length % 2 != 0){
            i++;
        }
        while (i < length){
            char e = pop();
            if (e != str[i])
                return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        char str[] = "naman".toCharArray();
        if (isPalindrome(str) == true){
            System.out.printf("Yes");
        }
        else{
            System.out.printf("No");
        }
    }
}
