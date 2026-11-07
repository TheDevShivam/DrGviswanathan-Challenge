import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n]; 
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
               
        int i=0;
        int j=1;
        int max=1;
        int ans = max;
        while(j<n){
            if(arr[j] - arr[i] <= 5){
                max++;
                ans = Math.max(max, ans);
                j++;
            }else{
                i++;
                max--;
            }
        }
        System.out.print(ans);
    }
}