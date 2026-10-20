import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        
        while(true){
            n = n+1;
            String str = String.valueOf(n);
            HashSet<Character> s= new HashSet<>();
            
            for(int i=0; i<4; i++){
                s.add(str.charAt(i));
            }
            if(s.size() == 4){
                int res = Integer.parseInt(str);
                System.out.println(res);
                return;
            }
        }
    }
}