import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String ss = sc.next();
        
        String s = ss.toLowerCase();
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='+') continue;
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        if(map.size() == 26){
            System.out.print("Yes");
        }else{
            System.out.print("NO");
        }
    }
}