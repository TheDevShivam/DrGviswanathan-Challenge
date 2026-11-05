import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            String s = sc.next();
 
            int count = 0;
            int ans = Integer.MAX_VALUE;
 
            int a = 0;
            int b = 0;
 
            while(b < n) {
                if(s.charAt(b) == 'W') {
                    count++;
                }
                if(b - a + 1 == k) {
                    ans = Math.min(ans, count);
 
                    if(s.charAt(a) == 'W') {
                        count--;
                    }
                    a++;
                }
                b++;
            }
 
            System.out.println(ans);
        }
    }
}