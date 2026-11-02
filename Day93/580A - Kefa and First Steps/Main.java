import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 1;
        int a = 0;
        int b = 1;

        while (b < n) {
            if (arr[b - 1] <= arr[b]) {
                ans = Math.max(ans, b - a + 1);
            } else {
                a = b;
            }

            b++;
        }

        System.out.print(ans);
    }
}
