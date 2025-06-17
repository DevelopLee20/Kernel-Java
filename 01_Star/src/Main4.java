public class Main4 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for(int i=0; i<5; i++) {
            array[i][i] = 1;
            array[i][4-i] = 1;
        }

        for (int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if (array[i][j] == 1){
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
