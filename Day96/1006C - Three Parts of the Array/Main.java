import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        long[] arr = new long[n];
 
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }
 
        long sum1 = 0, sum3 = 0;
        long ans = 0;
 
        int i = 0, j = n - 1;
 
        while(i <= j){
            if(sum1 <= sum3){
                sum1 += arr[i];
                i++;
            } else {
                sum3 += arr[j];
                j--;
            }
 
            if(sum1 == sum3){
                ans = sum1;
            }
        }
 
        System.out.println(ans);
    }
}