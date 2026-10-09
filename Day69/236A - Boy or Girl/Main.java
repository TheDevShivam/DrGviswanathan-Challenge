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
        
        if(map.size()%2 != 0){
            System.out.print("IGNORE HIM!");
        }else{
            System.out.print("CHAT WITH HER!");
        }
    }
}
