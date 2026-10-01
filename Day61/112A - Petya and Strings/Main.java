import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String a = sc.next();
        String b = sc.next();
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int ans = 0;
        
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) < b.charAt(i)) {
                ans = -1;
                break;
            }
            if (a.charAt(i) > b.charAt(i)) {
                ans = 1;
                break;
            }
        }
        System.out.println(ans);
    }
}