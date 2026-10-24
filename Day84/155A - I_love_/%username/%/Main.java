import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int n1 = sc.nextInt();
        int max = n1;
        int min = n1;
        int ans = 0;
 
        for (int i = 1; i < n; i++) {
            int s = sc.nextInt();
 
            if (s < min) {
                min = s;
                ans++;
            }
 
            if (s > max) {
                max = s;
                ans++;
            }
        }
 
        System.out.print(ans);
    }
}