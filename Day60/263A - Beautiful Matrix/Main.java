import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();

                if (arr[i][j] == 1) {
                    int moves = Math.abs(i - 2) + Math.abs(j - 2);
                    System.out.println(moves);
                }
            }
        }
    }
}