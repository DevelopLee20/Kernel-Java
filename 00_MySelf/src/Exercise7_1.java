//class SutdaDeck{
//    final int CARD_NUM = 20;
//    SutdaCard[] cards = new SutdaCard[CARD_NUM];
//
//    SutdaDeck(){
//        int[] kwangNums = {1, 3, 8};
//        int idx = 0;
//        int num = 1;
//        while(idx < CARD_NUM){
//            cards[idx++] = new SutdaCard(num++, false);
//
//            if(num > 10){
//                num = 1;
//            }
//        }
//
//        for(int i : kwangNums){
//            cards[i-1].isKwang = true;
//        }
//    }
//
//    public void shuffle(){
//        for(int i=0; i<CARD_NUM; i++){
//            int idx1 = (int) (Math.random() * CARD_NUM);
//            int idx2 = (int) (Math.random() * CARD_NUM);
//            SutdaCard temp = cards[idx1];
//            cards[idx1] = cards[idx2];
//            cards[idx2] = temp;
//        }
//    }
//
//    public SutdaCard pick(int index){
//        return cards[index];
//    }
//
//    public SutdaCard pick(){
//        return cards[(int) (Math.random() * CARD_NUM)];
//    }
//}
//
//class SutdaCard{
//    int num;
//    boolean isKwang;
//
//    SutdaCard(){
//        this(1, true);
//    }
//
//    SutdaCard(int num, boolean isKwang){
//        this.num = num;
//        this.isKwang = isKwang;
//    }
//
//    public String toString(){
//        return num + (isKwang ? "K" : "");
//    }
//}
//
//public class Exercise7_1 {
//    public static void main(String[] args) {
//        SutdaDeck deck = new SutdaDeck();
//
//        System.out.println(deck.pick(0));
//        System.out.println(deck.pick());
//        deck.shuffle();
//
//        for(int i=0; i<deck.cards.length; i++){
//            System.out.print(deck.cards[i] + ",");
//        }
//
//        System.out.println();
//        System.out.println(deck.pick(0));
//    }
//}
