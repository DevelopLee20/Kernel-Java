import java.util.Arrays;

public class Main2 {
    public static int mid(int a, int b, int c){
        if (a > b && b > c || a < b && b < c){
            return b;
        }
        else if (b > a && a > c || b < a && a < c){
            return a;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(mid(1, 2, 3));
        System.out.println(mid(2, 1, 3));
        System.out.println(mid(1, 1, 1));
    }
}
