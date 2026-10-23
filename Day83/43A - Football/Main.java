import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        
        Map<String,Integer> m = new HashMap<>();
        
        for(int i=0; i<n; i++){
                String team = sc.next();
                m.put(team, m.getOrDefault(team,0)+1);
                
        }
        
        String ans = "";
        
        for (String team : m.keySet()) {
            if (m.get(team) > n / 2) {
                ans = team;
                break;
            }
        }
 
        System.out.println(ans);
        
        
    }
}