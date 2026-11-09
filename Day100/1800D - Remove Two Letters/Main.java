import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int ans = 1;
 
            for(int i = 0; i < n-2; i++) {
                if(s.charAt(i) != s.charAt(i+2)) {
                    ans++;
                }
            }
 
            System.out.println(ans);
        }
    }
}
