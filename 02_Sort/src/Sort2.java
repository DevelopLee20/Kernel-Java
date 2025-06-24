class Sort2{
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
            System.out.println(i + "의 개수 :"+ counter[i]);
        }

        // 0~9까지 counter 값이 0이 아닐 때 출력
        for(int i=0; i<10; i++){
            if(counter[i] > 0){
                System.out.print(i);
            }
        }
        System.out.println();
    }
}
