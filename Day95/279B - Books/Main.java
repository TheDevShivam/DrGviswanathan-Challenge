import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int a = 0;
        int b = 0;
        int max = 0;
        int currSum = 0;
        
        while(b<n){
            currSum += arr[b];
            if(currSum>t){
                currSum -= arr[a];
                a++;
            }
            max = Math.max(max,b-a+1);
            b++;
        }
        
        System.out.print(max);
        
    }
}
