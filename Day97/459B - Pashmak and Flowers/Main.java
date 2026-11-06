import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        
        HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int i=0; i<n;i++){
            int b = sc.nextInt();
            map.put(b, map.getOrDefault(b,0)+1);
        }
 
        int max = 0;
        int min = Integer.MAX_VALUE;
 
        for(int key : map.keySet()) {
            if(key>max){
                max = key;
            }
            if(key<min){
                min = key;
            }
        }
        long ways;
 
        if(max == min) {
            ways = (long)n * (n - 1) / 2;
        } else {
            ways = (long)map.get(max) * map.get(min);
        }
        System.out.print((max-min) + " " + ways);
    }
}