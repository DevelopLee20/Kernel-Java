public class Main6 {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (y >= -x + 4) {
                    System.out.print("*");
                }
                else{
                   System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
