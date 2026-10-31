import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        double max = Math.max(arr[0], l - arr[n - 1]);

        for (int i = 1; i < n; i++) {
            double gap = (arr[i] - arr[i - 1]) / 2.0;
            max = Math.max(max, gap);
        }

        System.out.println(max);
    }
}
