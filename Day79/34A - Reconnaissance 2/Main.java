import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        int ans = Integer.MAX_VALUE;
        int ansIdx = 0;
        
        for(int i=0; i<n; i++){
            int diff = Math.abs(arr[i] - arr[(i+1) % n]) ;
            if( diff < ans){
                ans = diff;
                ansIdx = i;
            }
        }
        
        
        System.out.println( (ansIdx+1) + " "+ (1+(ansIdx+1)%n));
        
    }
}