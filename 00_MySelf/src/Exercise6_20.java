public class Exercise6_20 {
    public static int[] shuffle(int[] array){
        for(int i=0; i<10; i++){
            int idx1 = (int) (Math.random() * array.length);
            int idx2 = (int) (Math.random() * array.length);

            int swap = array[idx1];
            array[idx1] = array[idx2];
            array[idx2] = swap;
        }

        return array;
    }

    public static void main(String args[]){
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
