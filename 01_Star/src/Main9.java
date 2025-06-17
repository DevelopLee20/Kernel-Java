public class Main9 {
    public static void main(String[] args) {
        int left_empty = 0;
        int star = 5;
        int right_empty = 0;

        while(star != -1){
            for(int i=0; i<left_empty; i++){
                System.out.print(" ");
            }
            for(int i=0; i<star; i++){
                System.out.print("*");
            }
            for(int i=0; i<right_empty; i++){
                System.out.print(" ");
            }
            System.out.println();
            left_empty++;
            star = star - 2;
            right_empty++;
        }
        star = star + 4;
        left_empty = left_empty - 2;
        right_empty = right_empty - 2;

        while(star != 7){
            for(int i=0; i<left_empty; i++){
                System.out.print(" ");
            }
            for(int i=0; i<star; i++){
                System.out.print("*");
            }
            for(int i=0; i<right_empty; i++){
                System.out.print(" ");
            }
            System.out.println();
            left_empty--;
            star = star + 2;
            right_empty--;
        }
    }
}
