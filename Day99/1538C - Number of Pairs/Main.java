import java.util.*;
 
public class Main {
 
    static long count(int[] arr, int n, int target) {
        int s = 0, e = n - 1;
        long ans = 0;
 
        while(s < e) {
            if(arr[s] + arr[e] <= target) {
                ans += e - s;
                s++;
            } else {
                e--;
            }
        }
 
        return ans;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
 
            int[] arr = new int[n];
 
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
 
            Arrays.sort(arr);
 
            long ans = count(arr, n, r) - count(arr, n, l - 1);
 
            System.out.println(ans);
        }
    }
}