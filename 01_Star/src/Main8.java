public class Main8 {
    public static void main(String[] args) {
        int left_empty = 4;
        int star = 1;
        int right_empty = 4;

        for(int i=0; i<5; i++){
            for(int j=0; j<left_empty; j++){
                System.out.print(" ");
            }
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            for(int j=0; j<right_empty; j++){
                System.out.print(" ");
            }
            System.out.println();

            left_empty--;
            star = star + 2;
            right_empty--;
        }
    }
}
