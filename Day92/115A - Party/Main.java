import java.util.*;

public class Main {

    static int level(int emp, int[] arr) {
        if (arr[emp] == -1) {
            return 1;
        }
        return 1 + level(arr[emp], arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] != -1) arr[i]--;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, level(i, arr));
        }

        System.out.println(ans);
    }
}
