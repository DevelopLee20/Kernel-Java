import java.util.Arrays;

class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();	   // 카드 한 벌(Deck)을 만든다.
        d.shuffle(); // 카드를 섞는다.

        Card[] my_card = new Card[5];
        int[] num_counter = new int[14];
        int[] kind_counter = new int[5];

        for(int i = 0; i < my_card.length; i++){
            my_card[i] = d.pick(i);                     // 카드 하나를 뽑는다
        }

//        // 테스트용 스트레이트 플러쉬
//        my_card[0].number = 2;
//        my_card[1].number = 3;
//        my_card[2].number = 4;
//        my_card[3].number = 5;
//        my_card[4].number = 6;
//        my_card[0].kind = 1;
//        my_card[1].kind = 1;
//        my_card[2].kind = 1;
//        my_card[3].kind = 1;
//        my_card[4].kind = 1;
//        // 테스트용 끝

//        // 테스트용 포카드
//        my_card[0].number = 2;
//        my_card[1].number = 2;
//        my_card[2].number = 2;
//        my_card[3].number = 2;
//        my_card[4].number = 6;
//        my_card[0].kind = 3;
//        my_card[1].kind = 2;
//        my_card[2].kind = 1;
//        my_card[3].kind = 2;
//        my_card[4].kind = 3;
//        // 테스트용 끝

//        // 테스트용 풀하우스
//        my_card[0].number = 3;
//        my_card[1].number = 3;
//        my_card[2].number = 3;
//        my_card[3].number = 2;
//        my_card[4].number = 2;
//        my_card[0].kind = 2;
//        my_card[1].kind = 4;
//        my_card[2].kind = 3;
//        my_card[3].kind = 2;
//        my_card[4].kind = 1;
//        // 테스트용 끝

        for(int i = 0; i < my_card.length; i++){
            System.out.println(my_card[i].toString());  // 무슨 카드인지 출력
            num_counter[my_card[i].number] += 1;        // 숫자 카운터 1 추가
            kind_counter[my_card[i].kind] += 1;         // 문양 카운터 1 추가
        }

        // 스트레이트 플러쉬 (숫자가 오름차순, 문양이 모두 같은(최대 5)
        boolean straight_flush = true;
        for(int i = 0; i < 14-5; i++){
            straight_flush = true;
            for(int j=i; j < i+5; j++){
                if(num_counter[j] == 0){
                    straight_flush = false;
                    break;
                }
            }
            // 스트레이트 플러쉬 출력
            if(straight_flush){
                System.out.println("STRAIGHT FLUSH");
                return;
            }
        }

        // 포카드 (같은 숫자가 4개)
        if(Arrays.stream(num_counter).max().getAsInt() >= 4){
            System.out.println("FOUR CARD");
            return;
        }

        // 풀하우스 (같은 숫자 3개와 2개)
        Arrays.sort(num_counter); // 오름차순 정렬
        if(num_counter[num_counter.length-1] == 3 && num_counter[num_counter.length-2] == 2){ // 정렬 후 가장 큰 숫자 개수와 그 다음이 각각 3개 2개일 때
            System.out.println("FULL HOUSE");
            return;
        }
    }
}

// Deck클래스
class Deck {
    final int CARD_NUM = 52;	// 카드의 개수
    Card[] cardArr = new Card[CARD_NUM];  // Card객체 배열을 포함

    Deck () {	// Deck의 카드를 초기화한다.
        int i=0;

        for(int k=Card.KIND_MAX; k > 0; k--)
            for(int n=0; n < Card.NUM_MAX ; n++)
                cardArr[i++] = new Card(k, n+1);
    }

    Card pick(int index) {	// 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
        return cardArr[index];
    }

    Card pick() {			// Deck에서 카드 하나를 선택한다.
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() { // 카드의 순서를 섞는다.
        for(int i=0; i < cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
} // Deck클래스의 끝

// Card클래스
class Card {
    static final int KIND_MAX = 4;	// 카드 무늬의 수
    static final int NUM_MAX  = 13;	// 무늬별 카드 수

    static final int SPADE   = 4;
    static final int DIAMOND = 3;
    static final int HEART   = 2;
    static final int CLOVER  = 1;

    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK"; // 숫자 10은 X로 표현

        return "kind : " + kinds[this.kind]
                + ", number : " + numbers.charAt(this.number);
    } // toString()의 끝
} // Card클래스의 끝
