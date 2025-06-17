public class Main10 {
    public static void main(String[] args) {
        int N = 5;
        int star = 1;
        int mid_empty = N-2;

        for(int i=0; i<N/2; i++){
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            for(int j=0; j<mid_empty; j++){
                System.out.print(" ");
            }
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            System.out.println();
            star++;
            mid_empty = mid_empty - 2;
        }

        for(int i=0; i<N; i++){
            System.out.print("*");
        }
        System.out.println();
        star--;
        mid_empty = mid_empty + 2;

        for(int i=0; i<N/2; i++){
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            for(int j=0; j<mid_empty; j++){
                System.out.print(" ");
            }
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            System.out.println();
            star--;
            mid_empty = mid_empty + 2;
        }
    }
}
