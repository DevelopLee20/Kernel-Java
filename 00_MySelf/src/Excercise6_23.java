import java.util.Arrays;

public class Excercise6_23 {
    public static int max(int[] data){
        if(data == null || data.length == 0){
            return -1;
        }
        return Arrays.stream(data).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값: " + max(data));
        System.out.println("최대값: " + max(null));
        System.out.println("최대값: " + max(new int[]{}));
    }
}
