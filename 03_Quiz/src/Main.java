public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {2, 1, 3};

        int s = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
//                if (i == j && arr[i] == arr2[j]) {
//                    s += 1;
//                }
//                else if (arr[i] == arr2[j]){
//                    b += 1;
//                }
                if (arr[i] == arr2[j]) {
                    if (i == j){
                        s += 1;
                    } else {
                        b += 1;
                    }
                }
            }
        }
        System.out.println(s + "S" + b + "B");
    }
}
