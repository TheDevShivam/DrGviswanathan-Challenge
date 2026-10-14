import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
        String t = sc.next();
        
        if(s.length()!= t.length()){
             System.out.print("NO");
             return;
        }
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != t.charAt(s.length()-i-1)){
                System.out.print("NO");
                return;
            }
        }
        
        System.out.println("YES");
        
    }
}
