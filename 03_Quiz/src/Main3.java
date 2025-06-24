import java.util.Scanner;

public class Main3 {
    public void name(){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] bingoArr = new int[5][5];

        // 입력
        for (int i = 0; i < bingoArr.length; i++) {
            for (int j = 0; j < bingoArr[i].length; j++) {
                bingoArr[i][j] = sc.nextInt();
            }
        }

        int score = 0;
        // 가로 빙고 계산
        for (int[] ints : bingoArr) {
            boolean bingo = true;
            for (int anInt : ints) {
                if (anInt == 0) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) {
                score++;
            }
        }

        // 세로 빙고 계산
        for (int i = 0; i < bingoArr.length; i++) {
            boolean bingo = true;
            for (int j = 0; j < bingoArr[i].length; j++) {
                if (bingoArr[j][i] == 0) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) {
                score++;
            }
        }

        // 대각선 빙고 계산
        for (int i = 0; i < bingoArr.length; i++) {
            boolean bingo = true;
            for (int j = 0; j < bingoArr[i].length; j++) {
                if (i == j || i+j == bingoArr.length-1 && bingoArr[j][i] == 0) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) {
                score++;
            }
        }

        System.out.println(score);
    }
}
