import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
        String ans = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                ans += "0";
            } else if (s.charAt(i + 1) == '.') {
                ans += "1";
                i++;
            } else {
                ans += "2";
                i++;
            }
        }
        System.out.print(ans);
        
    }
}