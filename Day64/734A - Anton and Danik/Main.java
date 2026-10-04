import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='+') continue;
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        int countA = map.getOrDefault('A', 0);
        int countD = map.getOrDefault('D', 0);
        
        if(countA>countD){
            System.out.print("Anton");
        }else if(countA<countD){
            System.out.print("Danik");
        }else{
            System.out.print("Friendship");
        }
    }
}