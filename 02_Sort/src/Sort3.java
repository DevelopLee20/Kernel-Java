class Sort3{
    public static void main(String[] args){
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for(int i=0; i<numArr.length; i++){
            numArr[i] = (int)(Math.random()*10);
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i=0; i<numArr.length; i++){
            counter[numArr[i]]++;
        }

        for(int i=0; i<numArr.length; i++){
            System.out.println(i + "의 개수 : "+ counter[i]);
        }

        // 0~9까지 counter 개수만큼 출력
        for(int i=0; i<10; i++){
            for(int j=0; j<counter[i]; j++){
                System.out.print(i);
            }
        }
        System.out.println();
    }
}
