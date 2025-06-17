public class Main9 {
    public static void main(String[] args) {
        int N = 5;

        for(int x=0; x<N; x++){
            for(int y=0; y<N; y++){
                if(y <= x && y >= (-x + 4) || (y >= x && y <= (-x + 4))){
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
