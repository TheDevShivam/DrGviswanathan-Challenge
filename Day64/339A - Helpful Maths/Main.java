import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='+') continue;
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        int ones = map.getOrDefault('1', 0);
        int twos = map.getOrDefault('2', 0);
        int threes = map.getOrDefault('3', 0);
        
        StringBuilder ans = new StringBuilder();
 
        for(int i = 0; i < ones; i++) {
            ans.append('1').append('+');
        }
 
        for(int i = 0; i < twos; i++) {
            ans.append('2').append('+');
        }
 
        for(int i = 0; i < threes; i++) {
            ans.append('3').append('+');
        }
 
        ans.deleteCharAt(ans.length() - 1);
 
        System.out.println(ans);
    }
}