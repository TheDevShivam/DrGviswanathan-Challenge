import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[m];
        
        for(int i=0; i<m; i++){
                int a = sc.nextInt();
                arr[i] = a;
        }
        
        long res = arr[0] - 1;
        int present = arr[0];
        
        for(int i=1; i<m; i++){
            
            int next = arr[i];
            
            if (present > next) {
                res += n - present + next;
            } else {
                res += next - present;
            }
            
            present = next;
        }
        
        System.out.print(res);
    }
}