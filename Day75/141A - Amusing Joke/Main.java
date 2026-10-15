import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s1 = sc.next();
        String s2 = sc.next();
        String s = sc.next();
        
        int[] count = new int[26];
        
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i) - 'A']++;
        }
        for(int i=0;i<s2.length();i++){
            count[s2.charAt(i) - 'A']++;
        }
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'A']--;
        }
        
        boolean ans = true;
        
        for(int i=0;i<26;i++){
            if(count[i] != 0){
                ans = false;
                break;
            }
        }
        
        if(ans){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
        
    }
}